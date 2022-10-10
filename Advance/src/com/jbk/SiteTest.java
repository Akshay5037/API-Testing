package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SiteTest {

	WebDriver driver = null;

	@Test(groups = "login")
	public void login() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
	}

	@Test(groups = "login")
	public void dash() {
		WebElement header = driver.findElement(By.xpath("//h1"));
		Assert.assertEquals(header.getText(), "dash");
	}

	@Test(groups = "user")
	public void user() {
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
	}
}
