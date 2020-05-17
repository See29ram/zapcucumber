package com.udemy.helper;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {

	private static BrowserHelper browserHelper;
	private static WebDriver dr;

	private BrowserHelper(WebDriver driver) {
		dr = driver;
	}

	public static BrowserHelper getInstance(WebDriver driver) {

		if (browserHelper == null || dr.hashCode() != driver.hashCode())

			browserHelper = new BrowserHelper(driver);

		return browserHelper;

	}

	public void moveForward() {
		dr.navigate().forward();
	}

	public void moveBack() {
		dr.navigate().back();
	}

	public void refresh() {
		dr.navigate().refresh();
	}

	public void maximize() {
		dr.manage().window().maximize();
	}

}
