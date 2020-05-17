package com.udemy.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.udemy.utils.ResourceUtils;

public class CustomChrome implements BrowserConfig{

	private void setDriverPath() {
		
		String browserDriverPath=ResourceUtils.getResourcePath("chromedriver.exe");
		//String browserDriverPath=System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", browserDriverPath);
		//System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
	}

	private ChromeOptions setChromeOptions() {
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		return opt;
	}

	public WebDriver getChromeDriver() {

		setDriverPath();
		ChromeOptions opt = setChromeOptions();
		return new ChromeDriver(opt);

	}

	@Override
	public WebDriver getBrowserDriver() {
		// TODO Auto-generated method stub
		return getChromeDriver();
	}

}
