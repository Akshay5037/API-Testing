package com.kiranacademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScriptExecutorEx {

	static WebDriver driver = null;
	RemoteWebDriver re = null;

	public void waitForElement(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void moveAndClick(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click(element).build().perform();
	}

	public static void scrollingToView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollingToView(true);", element);
	}

	@Test
	public void test01() throws Exception {
		WebElement uname, pass;
		RemoteWebDriver rd = null;

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		// driver.navigate().to("");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;// type casting
		System.out.println(driver.getCurrentUrl());

		System.out.println("Title printed by js " + js.executeScript("return document.title;"));
		// Changing title by js

		js.executeScript("document title='updated title';");
		System.out.println(driver.getTitle());// updated title

		driver.navigate().refresh();// refreshing browser by js

		js.executeScript("history.go(0)");
		// checking element by js

		js.executeScript("arguments[0].click();", uname = driver.findElement(By.id("email")));

		js.executeScript("document.getElementById('email').value='kiran@gmail.com';");

		driver.findElement(By.id("email")).getAttribute("value");// kiran@gmail.com
		// clicking element by js

		js.executeScript("arguments[0].click();", pass = driver.findElement(By.id("password")));

		// using sendkeys by js
		js.executeScript("alert('hello world');");
		// optional

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());

		Thread.sleep(5000);
		al.accept();

//		driver.navigate().to("");
//		navigating to other url

		js.executeScript("window.location='https://www.amazon.in/'");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		WebElement footer_Logo = driver.findElement(By.xpath("//a[@href='/ref=footer_logo']"));

		js.executeScript("arguments[0].scrollIntoView(true);", footer_Logo);
		// scrollingToView(footer_Logo);

		Thread.sleep(5000);

		WebElement header_Logo = driver.findElement(By.xpath("//a[text()='Best Sellers']"));

		// js.executeScript("arguments[0].scrollIntoView(true);", header_Logo);

		js.executeScript("scrollBy(0,-2000);");
	}
}
