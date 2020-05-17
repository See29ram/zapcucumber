package com.udemy.compositeActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.udemy.browser.CustomChrome;
import com.udemy.browser.CustomFireFox;
import com.udemy.drivers.DriverService;
import com.udemy.helper.BrowserHelper;
import com.udemy.helper.GenericHelper;
import com.udemy.utils.IReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ActionsStepDefn {

	private WebDriver dr;
	private IReader ireader;
	private BrowserHelper browserHelper;
	private Actions act;
	private GenericHelper genericHelper;
	
	public ActionsStepDefn(DriverService driverService)
	{
		System.out.println("Driver Service from StepDefn-"+driverService.hashCode());
		dr=driverService.getDriver();
		browserHelper=driverService.getBrowserHelper();
		ireader=driverService.getIreader();
		genericHelper=driverService.getGenericHelper();
	}

	@Given("I open Action Class Site {string}")
	public void i_open_Action_Class_Site(String url) {
		// Write code here that turns the phrase above into concrete actions
		//CustomChrome chrome = new CustomChrome();
		//dr = chrome.getChromeDriver();
		//CustomFireFox firefox=new CustomFireFox();
		//dr=firefox.getFirefoxDriver();
		dr.get(ireader.getAppUrl());
		//browserHelper = BrowserHelper.getInstance(dr);
		//browserHelper.maximize();
		act = new Actions(dr);

	}

	@When("Drag an Drop Element")
	public void drag_an_Drop_Element() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		act.dragAndDrop(dr.findElement(By.id("draggable")), dr.findElement(By.id("droppable"))).build().perform();

		act.contextClick(dr.findElement(By.linkText("Selectable"))).build().perform();
		Thread.sleep(3000);

	}

	@When("I Click and Hold and do release")
	public void i_Click_and_Hold_and_do_release() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		act.clickAndHold(dr.findElement(By.id("draggable"))).moveToElement(dr.findElement(By.id("droppable"))).release()
				.build().perform();
		
		
		genericHelper.getScreenShot("Screenshots", "action.png");
		//File file=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("D:\\Projects\\JavaProjects\\LearnCucumber\\BrowserDrivers\\vv.png"));
	}

	@When("Caps Search in Google")
	public void caps_Search_in_Google() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement we=dr.findElement(By.name("q"));
		act.keyDown(Keys.SHIFT).sendKeys(we,"selenium").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
	}

	@When("I close Action browser")
	public void i_close_Action_browser() {
		// Write code here that turns the phrase above into concrete actions
	}

}
