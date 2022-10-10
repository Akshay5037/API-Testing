package com.jbk;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");

		List<WebElement> we = driver.findElements(By.partialLinkText("Mor"));
		for (WebElement web : we) {
			web.click();
		}
		Set<String> window = driver.getWindowHandles();
		System.out.println(window.size());

		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);

		for (String swindow : window) {
			if (!swindow.equals(mainWindow)) {
				/*driver.switchTo().window(swindow);
				System.out.println(swindow);
				System.out.println(driver.getCurrentUrl());
				driver.close();*/
				
				ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tab.get(2));
				System.out.println(swindow);
			}
		}

	}

}
