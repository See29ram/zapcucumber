package com.udemy.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxHelper {

	private static TextBoxHelper textboxHelper;
	private static WebDriver dr;
	private WebElement we;

	private TextBoxHelper(WebDriver driver) {
		dr = driver;
	}

	public static TextBoxHelper getInstance(WebDriver driver) {

		if (textboxHelper == null || dr.hashCode() != driver.hashCode())

			textboxHelper = new TextBoxHelper(driver);

		return textboxHelper;

	}

	public void setText(By locator, String text) {
		we = dr.findElement(locator);
		we.sendKeys(text);
	}

	public String getText(By locator) {
		return dr.findElement(locator).getText();
	}

	public void clearText(By locator) {
		dr.findElement(locator).clear();
	}

}
