package com.udemy.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import com.udemy.browser.BrowserConfig;
import com.udemy.browser.CustomChrome;
import com.udemy.browser.CustomFireFox;
import com.udemy.helper.AlertHelper;
import com.udemy.helper.BrowserHelper;
import com.udemy.helper.ButtonHelper;
import com.udemy.helper.DropdownHelper;
import com.udemy.helper.GenericHelper;
import com.udemy.helper.TextBoxHelper;
import com.udemy.helper.WindowHelper;
import com.udemy.utils.IReader;
import com.udemy.utils.ReadConfig;

public class DriverService {

	private WebDriver driver;
	private AlertHelper alertHelper;
	private BrowserHelper browserHelper;
	private ButtonHelper buttonHelper;
	private DropdownHelper dropdownHelper;
	private TextBoxHelper textboxHelper;
	private WindowHelper windowHelper;
	private IReader ireader;
	private BrowserConfig browserConfig;
	private GenericHelper genericHelper;
    public GenericHelper getGenericHelper() {
		return genericHelper;
	}

	
	public BrowserConfig getBrowserConfig() {
		return browserConfig;
	}

	public IReader getIreader() {
		return ireader;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public AlertHelper getAlertHelper() {
		return alertHelper;
	}

	public BrowserHelper getBrowserHelper() {
		return browserHelper;
	}

	public ButtonHelper getButtonHelper() {
		return buttonHelper;
	}

	public DropdownHelper getDropdownHelper() {
		return dropdownHelper;
	}

	public TextBoxHelper getTextboxHelper() {
		return textboxHelper;
	}

	public WindowHelper getWindowHelper() {
		return windowHelper;
	}

	public DriverService() {

		LaunchBrowser();
	}

	public void LaunchBrowser() {
		// C
		ireader = new ReadConfig();
		ireader.setBrowserType();
		driver = getBrowserDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		alertHelper = AlertHelper.getInstance(driver);
		browserHelper = BrowserHelper.getInstance(driver);
		buttonHelper = ButtonHelper.getInstance(driver);
		dropdownHelper = DropdownHelper.getInstance(driver);
		textboxHelper = TextBoxHelper.getInstance(driver);
		windowHelper = WindowHelper.getInstance(driver);
		genericHelper=GenericHelper.getInstance(driver);
	}

	public WebDriver getBrowserDriver() {
		String brwType = ireader.getBrowserType();
		
		switch (brwType) {
		case BrowserType.CHROME:
			browserConfig = new CustomChrome();
			return browserConfig.getBrowserDriver();
			
		case BrowserType.FIREFOX:
			browserConfig = new CustomFireFox();
			return browserConfig.getBrowserDriver();
			
		default:
			throw new RuntimeException("Invalid Browser Type "+brwType);

		}
		
	}

}
