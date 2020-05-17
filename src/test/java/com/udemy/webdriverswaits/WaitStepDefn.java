package com.udemy.webdriverswaits;


import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.udemy.browser.CustomChrome;

import com.udemy.helper.BrowserHelper;
import com.udemy.helper.ButtonHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WaitStepDefn {

	WebDriver dr;
	BrowserHelper browserHelper;
	ButtonHelper buttonHelper;

	@Given("I Open site {string}")
	public void i_Open_site(String url) {
		// Write code here that turns the phrase above into concrete actions
		CustomChrome chrome = new CustomChrome();
		//dr = chrome.getChromeDriver();
		dr.get(url);
		browserHelper = BrowserHelper.getInstance(dr);
		browserHelper.maximize();
		buttonHelper = ButtonHelper.getInstance(dr);

	}

	@When("I wait for {string} to Click and I click")
	public void i_wait_for_to_Click_and_I_click(String string) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		buttonHelper.click(By.linkText(string));
	}
	@When("I ImplicitWait for {string} and I click")
	public void i_ImplicitWait_for_and_I_click(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   buttonHelper.click(By.linkText(string));
	}
	@When("I ExplicitWait for {string} and I click")
	public void i_ExplicitWait_for_and_I_click(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverWait wait=new WebDriverWait(dr,30);
	    
	    wait.ignoring(NoSuchElementException.class);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(string))).click();
	    wait.until(customWait(string)).click();;
	    
	    //buttonHelper.click(By.linkText(string));
	}

	@Then("I close Browser")
	public void i_close_Browser() {
		// Write code here that turns the phrase above into concrete actions
		if (dr != null)
			dr.quit();
	}
	
	private Function<WebDriver, Boolean> customWait()
	{
		Function<WebDriver, Boolean> wait =new Function<WebDriver, Boolean>() {

			@Override
			public Boolean apply(WebDriver t) {
				// TODO Auto-generated method stub
				if(t.findElements(By.id("periodicElement")).size()>19)
				{
					System.out.println("Located");
					return true;
				}
				System.out.println("waiting");
				return false;
					
			}
		};
		return wait;
	}
	
	private Function<WebDriver, WebElement> customWait(String linkText)
	{
		
		//WebElement wee=dr.findElement(By.linkText("Element1"));
		Function<WebDriver,WebElement> wait=new Function<WebDriver,WebElement>()
				{

					@Override
					public WebElement apply(WebDriver t) {
						// TODO Auto-generated method stub
						if(t.findElements(By.linkText(linkText)).size()>0)
						{
							System.out.println("Located");
							return dr.findElement(By.linkText(linkText));
						}
						System.out.println("waiting");
						return null;
					}
			
				};
		return wait;
	}

}
