 package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver= null;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	public void logintoApplication(String usrname,String passwrd) {
		username.sendKeys(usrname);
		password.sendKeys(passwrd);
		loginButton.click();
	}
	public DashboardPage getdashboard() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginButton.click();
		
		return new DashboardPage(driver);
	}

}
