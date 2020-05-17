package com.udemy.LearnCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lauchfirefox {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumJar\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.google.com");
		dr.quit();
		
		
	}
	
	
}
