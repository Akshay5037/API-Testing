package com.base;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertiesUtils;

public class BaseClass {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(BaseClass.class);

	public static ExtentReports report = null;
	public static ExtentTest test = null;
	public static ExtentSparkReporter spark = null;

	public void initialization() throws Exception {

		log.info("initializing browser");
		String browserName = PropertiesUtils.readProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
//		if(BrowserName.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//		}
//		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(PropertiesUtils.readProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void reportInit() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentrReport.html");
		report.attachReporter(spark);
	}

}
