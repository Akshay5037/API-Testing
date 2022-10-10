package com.jbk;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaByKiran {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.id("password")).submit();
//		driver.findElement(By.xpath("//button")).click();
		
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
//		
//		driver.findElement(By.id("Male")).click();
//		Thread.sleep(100);
//		driver.findElement(By.id("Female")).click();
//		WebElement we=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
//		WebElement we=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a"));
//		Select select=new Select(we);
		
//		select.selectByIndex(1);
//		select.selectByValue("Maharashtra");
//		select.selectByVisibleText("Maharashtra");
	
		List<WebElement> element=driver.findElements(By.partialLinkText("Mor"));
		System.out.println(element.size());
		for (WebElement webElement : element) {
			webElement.click();
		}
		Set<String> ele= driver.getWindowHandles();
		System.out.println(ele.size());
		//driver.close();
		//driver.quit();
				}
		
	}