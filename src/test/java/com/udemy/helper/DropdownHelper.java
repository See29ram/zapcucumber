package com.udemy.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {

	private static DropdownHelper dropdownHelper;
	private static WebDriver dr;

	private DropdownHelper(WebDriver driver) {
		dr = driver;
	}

	public static DropdownHelper getInstance(WebDriver driver) {
		if (dropdownHelper == null || driver.hashCode() != dr.hashCode())

			dropdownHelper = new DropdownHelper(driver);

		return dropdownHelper;

	}

	/**
	 * @param locator-By using index
	 * @param index-pass Integer value
	 */
	public void SelectByIndex(By locator, int index) {

		Select select = new Select(dr.findElement(locator));
		select.selectByIndex(index);

	}

	public void SelectByValue(By locator, String value) {

		Select select = new Select(dr.findElement(locator));
		select.selectByValue(value);

	}

	public void SelectByVisibleText(By locator, String value) {

		Select select = new Select(dr.findElement(locator));
		select.selectByVisibleText(value);

	}
	public List<WebElement> getAllOptions(By locator)
	{
		Select select = new Select(dr.findElement(locator));
		return select.getOptions();
	}

}
