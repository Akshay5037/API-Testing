package com.jbk;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotest {
	
	@Test
	public void login() {
		System.out.println("login");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = "login")
	public void dash() {
		System.out.println("dash");
	}
	@Test(dependsOnMethods = "dash", alwaysRun = true)
	public void user() {
		System.out.println("user");
	}

}
