package com.udemy.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHelper {

	private static AlertHelper alertHelper;
	private static WebDriver dr;

	private AlertHelper(WebDriver driver) {
		dr = driver;
	}

	public static AlertHelper getInstance(WebDriver driver) {

		if (alertHelper == null || dr.hashCode() != driver.hashCode())
			alertHelper = new AlertHelper(driver);

		return alertHelper;

	}

	public void AcceptAlert() {
		Alert alt = getWait().until(ExpectedConditions.alertIsPresent());
		alt.accept();
	}

	public void DismissAlert() {
		Alert alt = getWait().until(ExpectedConditions.alertIsPresent());
		alt.dismiss();
	}

	public void AcceptAlertWithText(String text) {
		Alert alt = getWait().until(ExpectedConditions.alertIsPresent());

		alt.sendKeys(text);
		alt.accept();
	}

	private WebDriverWait getWait() {
		return new WebDriverWait(dr, 30);
	}

}
