package com.udemy.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CustomFireFox implements BrowserConfig{

	private WebDriver getFirefoxDriver() {

		setDriverPath();
		FirefoxOptions fopt = getFirefoxOptions();
		return new FirefoxDriver(fopt);

	}

	private void setDriverPath() {
		System.setProperty("webdriver.gecko.driver", "D:\\seleniumJar\\geckodriver.exe");

	}

	private FirefoxOptions getFirefoxOptions() {
		FirefoxOptions fopt = new FirefoxOptions();
		fopt.setAcceptInsecureCerts(true);
		return fopt;

	}

	@Override
	public WebDriver getBrowserDriver() {
		// TODO Auto-generated method stub
		return getFirefoxDriver();
	}

}
