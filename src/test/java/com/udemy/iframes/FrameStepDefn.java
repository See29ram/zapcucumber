package com.udemy.iframes;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.udemy.browser.CustomChrome;
import com.udemy.helper.BrowserHelper;
import com.udemy.helper.ButtonHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrameStepDefn {
     
	WebDriver dr;
	ButtonHelper buttonHelper;
	BrowserHelper browserHelper;
	@Given("I open frame site {string}")
	public void i_open_frame_site(String url) {
	    // Write code here that turns the phrase above into concrete actions
		CustomChrome chrome=new CustomChrome();
		//dr = chrome.getChromeDriver();
		dr.get(url);
		browserHelper=BrowserHelper.getInstance(dr);
		browserHelper.maximize();
		buttonHelper=ButtonHelper.getInstance(dr);
		
	}

	@When("I click On Element inside Frame and I should be clicked")
	public void i_click_On_Element_inside_Frame_and_I_should_be_clicked() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		dr.switchTo().frame(1);
		buttonHelper.click(By.linkText("Way2Tutorial.com"));
		dr.switchTo().parentFrame();
		dr.switchTo().frame(0);
		buttonHelper.click(By.linkText("Way2Tutorial.com"));
		Thread.sleep(6000);
		
		
		WebDriverWait wait=new WebDriverWait(dr,20);
	
		
	    
	}
	@Then("I Close Browser")
	public void i_Close_Browser() {
	    // Write code here that turns the phrase above into concrete actions
	    if(dr!=null)
	    	dr.quit();
	}	
	
}
