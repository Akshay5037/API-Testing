package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider="dp")
	public void tests(String uname, String pass) {
		System.setProperty("wbdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@DataProvider
	public Object[][] dp(){
		return new Object[][] {
			  new Object[] { "kiran@gmail.com", "123456" },
				new Object[] { "abhayshinde45@gmail.com", "123456" },
				new Object[] { "kiran@gmail.com", "123" },
				new Object[] { " ", " " }, 
		};
	}

}
