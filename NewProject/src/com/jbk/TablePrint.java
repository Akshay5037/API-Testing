package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePrint {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
		
//		for(int i=2;i<=5;i++) {
//			for(int j=1;j<=8;j++) {
//				String name =driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//				System.out.print(name+" ");
				
				String name =driver.findElement(By.tagName("table")).getText();
				System.out.print(name+" ");
			
			System.out.println();
	}
	}


