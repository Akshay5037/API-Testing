package com.jbk;

import org.testng.annotations.Test;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ExcelAndDataProvider {
  @Test(dataProvider = "dp")
  public void f(String username, String pass) {
	  System.out.println(username);
	  System.out.println(pass);
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("file:///C:/Users/LENOVO/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
  
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button")).click();
	  
	  Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
  }

  @DataProvider
  public Object[][] dp() throws Exception {
    
	  FileInputStream fis=new FileInputStream("TestData.xlsx");
	  HSSFWorkbook wb=new HSSFWorkbook(fis);
	  
	  HSSFSheet sheet=wb.getSheet("sheet1");
//	  int rows=sheet.getRow(0);
//	  System.out.println(rows);
	  
	 
	return null;
	  
	 // String [][]obj=new String[]
    }
  }
