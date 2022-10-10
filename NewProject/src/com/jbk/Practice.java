package com.jbk;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Practice {

	public static void main(String[] args) {

		// RemoteWebDriver driver= new ChromeDriver();
		try {
			System.out.println("before divide");
			int y = 10 / 0;
			System.out.println("after divide");
		} catch (Exception e) {
			System.out.println("first catch");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}

}
