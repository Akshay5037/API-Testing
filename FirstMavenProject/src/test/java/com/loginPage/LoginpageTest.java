package com.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.DashboardPage;
import com.jbk.LoginPage;

public class LoginpageTest {
	WebDriver driver = null;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		LoginPage lp = new LoginPage(driver);

		lp.logintoApplication("kiran@gmail.com", "123456");

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

	@Test

	public void test02() {
		DashboardPage dp = new DashboardPage(driver);
		
		Assert.assertTrue(dp.verifyCourses());
	}
}
