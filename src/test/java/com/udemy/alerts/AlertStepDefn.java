package com.udemy.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.udemy.browser.CustomChrome;
import com.udemy.helper.AlertHelper;
import com.udemy.helper.BrowserHelper;
import com.udemy.helper.ButtonHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AlertStepDefn {

	WebDriver dr;
	ButtonHelper buttonHelper;
	BrowserHelper browserHelper;
	AlertHelper alertHelper;
	@Given("I Open Alert Site {string}")
	public void i_Open_Alert_Site(String url) {
		// Write code here that turns the phrase above into concrete actions
		CustomChrome chrome=new CustomChrome();
		dr = chrome.getChromeDriver();
		dr.get(url);
		browserHelper=BrowserHelper.getInstance(dr);
		browserHelper.maximize();
		buttonHelper=ButtonHelper.getInstance(dr);
		alertHelper=AlertHelper.getInstance(dr);
	}

	@When("I click on Alert Box")
	public void i_click_on_Alert_Box() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		buttonHelper.click(By.xpath("//button[@onclick='myAlertFunction()']"));
		//getWait(30).until(ExpectedConditions.alertIsPresent());
		//Alert alt=dr.switchTo().alert();
	
		//Thread.sleep(3000);	
		//alt.accept();
		alertHelper.AcceptAlert();
		Thread.sleep(3000);
		
	}

	@When("I Click on Confirm Box")
	public void i_Click_on_Confirm_Box() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		buttonHelper.click(By.xpath("//button[@onclick='myConfirmFunction()']"));
		//getWait(30).until(ExpectedConditions.alertIsPresent());
		//Alert alt=dr.switchTo().alert();
		//Thread.sleep(3000);	
		//alt.dismiss();
		alertHelper.DismissAlert();
		Thread.sleep(3000);
	}

	@When("I Click on Promptbox")
	public void i_Click_on_Promptbox() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		buttonHelper.click(By.xpath("//button[@onclick='myPromptFunction()']"));
		//getWait(30).until(ExpectedConditions.alertIsPresent());
		//Alert alt=dr.switchTo().alert();
		//Thread.sleep(3000);
		//alt.sendKeys("Testing");
		//alt.accept();
		alertHelper.AcceptAlertWithText("Hey Ji");
		Thread.sleep(4000);	
		
	}

	@When("I Close Alert Browser")
	public void i_Close_Alert_Browser() {
		// Write code here that turns the phrase above into concrete actions
		if(dr!=null)
			dr.quit();
		
	}
	
	public WebDriverWait getWait(int time)
	{
		
		return new WebDriverWait(dr,time);
		
	}

}
