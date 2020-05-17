package com.udemy.hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.udemy.drivers.DriverService;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GeneralHooks {

	private DriverService driverService;
	private WebDriver driver;

	public GeneralHooks(DriverService driverService) {
		System.out.println("Driver Service from Hook-" + driverService.hashCode());
		this.driverService = driverService;
		driver = driverService.getDriver();

	}

	@Before(value = "@Regression",order=2)
	public void SetupforRegression()
	{
		System.out.println("Hook before method with tagging for regression");
	}
	
	@Before(order=1)
	public void Setup() {
		System.out.println("Hook before method without Tagging");
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			int random = (int) (Math.random() * 1000);
			driverService.getGenericHelper().getScreenShot("zscreenshots", "scr" + random + ".png");
			scenario.attach(driverService.getGenericHelper().getScreenshot(),"image/png", "Test Attach screenshot");
		}

		System.out.println("Hook after method");
		if (driver != null)
			driver.quit();
	}

}
