package com.udemy.LearnCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IElaunch {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "D:\\seleniumJar\\IEDriverServer.exe");
		WebDriver dr=new InternetExplorerDriver();
		dr.get("https://www.google.com");
		dr.quit();
		
	}
	
}
