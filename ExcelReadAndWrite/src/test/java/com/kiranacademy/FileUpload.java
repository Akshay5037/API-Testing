package com.kiranacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver = null;

	@Test
	public void test01() throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriverAutoIT.exe");
		driver = new ChromeDriver();
		driver.get("http://javabykiran.com/playground/file-upload");
		driver.findElement(By.id("file")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");
		 driver.findElement(By.id("submitbutton")).click();
	}
}
