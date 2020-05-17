package com.udemy.LearnCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "D:\\seleniumJar\\msedgedrivernew.exe");
		WebDriver dr=new EdgeDriver();
		dr.get("https://www.google.com");
		
		dr.quit();
		
		
	}
	
}
