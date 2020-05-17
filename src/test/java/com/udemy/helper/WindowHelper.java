package com.udemy.helper;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHelper {

	private static WebDriver dr;
	private static WindowHelper windowHelper;

	private WindowHelper(WebDriver driver) {
		dr = driver;
	}

	public static WindowHelper getInstance(WebDriver driver) {

		if (windowHelper == null || driver.hashCode() != dr.hashCode())
			windowHelper = new WindowHelper(driver);

		return windowHelper;

	}

	private ArrayList<String> getAllWindows() {

		return new ArrayList<String>(dr.getWindowHandles());

	}
	
	private WebDriverWait getWait()
	{
		
		return new WebDriverWait(dr,30);
	}

	public void switchToWindow(int index) {
        
		getWait().until(ExpectedConditions.numberOfWindowsToBe(index+1));
		
		ArrayList<String> totWindows = getAllWindows();

		if (index < 0 || index > totWindows.size() - 1)
			throw new IllegalArgumentException("Invalid Index to Select Window " + index);
		dr.switchTo().window(totWindows.get(index));

	}

	public void switchToParent() {
		ArrayList<String> totWindows = getAllWindows();
		dr.switchTo().window(totWindows.get(0));
	}

	public void switchToParentWithClose() {
		ArrayList<String> totWindows = getAllWindows();

		for (int i = 1; i < totWindows.size(); i++) {
			dr.switchTo().window(totWindows.get(i)).close();
		}
		switchToParent();
	}

}
