package com.jbk;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	@FindBy(xpath = "//h3")

	List<WebElement> courses;

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyCourses() {
		boolean flag = false;
		for (WebElement course : courses) {
			flag = course.isDisplayed();
		}
		System.out.println(flag);
		return flag;
	}

}
