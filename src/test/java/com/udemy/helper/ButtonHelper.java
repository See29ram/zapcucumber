package com.udemy.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonHelper {

	private static ButtonHelper buttonHelper;
	private static WebDriver dr;

	private ButtonHelper(WebDriver driver) {
		dr = driver;
	}

	public static ButtonHelper getInstance(WebDriver driver) {
		if (buttonHelper == null || driver.hashCode() != dr.hashCode())
			buttonHelper = new ButtonHelper(driver);
		return buttonHelper;

	}

	public void click(By locator) {
		dr.findElement(locator).click();
	}

}
