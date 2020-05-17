package com.udemy.LearnCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.udemy.helper.BrowserHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowserSteps {

	
	private WebDriver dr;
	private BrowserHelper browserHelper;
	@Given("Browser Launched with Url {string}")
	public void browser_Launched_with_Url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
        dr=new ChromeDriver();
        browserHelper=BrowserHelper.getInstance(dr);
		dr.get(url);
	    
	}

	@When("Browser Navigates To Url {string}")
	public void browser_Navigates_To_Url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    dr.navigate().to(url);
	}

	@When("I maximize Browser")
	public void i_maximize_Browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //dr.manage().window().maximize();
		browserHelper.maximize();
	    
	}

	@When("I Back to Old Url")
	public void i_Back_to_Old_Url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //dr.navigate().back();
		browserHelper.moveBack();
	    Thread.sleep(3000);
	}

	@When("I move to forward")
	public void i_move_to_forward() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //dr.navigate().forward();
		browserHelper.moveForward();
	    Thread.sleep(3000);
	    //dr.navigate().refresh();
	    browserHelper.refresh();
	    Thread.sleep(3000);
	}
	
	


	@Then("I close browser")
	public void i_close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   if(dr!=null)
		   dr.quit();
	}	
	
	
}
