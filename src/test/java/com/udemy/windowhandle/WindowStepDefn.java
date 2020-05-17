package com.udemy.windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.udemy.browser.CustomChrome;
import com.udemy.helper.BrowserHelper;
import com.udemy.helper.ButtonHelper;
import com.udemy.helper.WindowHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WindowStepDefn {

	WebDriver dr;
	ButtonHelper buttonHelper;
	BrowserHelper browserHelper;
	ArrayList<String> totWnds;
	WindowHelper windowHelper;
	@Given("When I open Site {string}")
	public void when_I_open_Site(String url) {
	    // Write code here that turns the phrase above into concrete actions
		CustomChrome chrome=new CustomChrome();
		//dr = chrome.getChromeDriver();
		dr.get(url);
		browserHelper=BrowserHelper.getInstance(dr);
		browserHelper.maximize();
		buttonHelper=ButtonHelper.getInstance(dr);
		windowHelper=WindowHelper.getInstance(dr);
	}

	@When("I click on new tab and I can work on element in new tab")
	public void i_click_on_new_tab_and_I_can_work_on_element_in_new_tab() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		//String pid=dr.getWindowHandle();
		buttonHelper.click(By.xpath("//button[@onclick='newBrwTab()']"));
		//WebDriverWait wait=new WebDriverWait(dr,30);
		//wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		//buttonHelper.click(By.xpath("//button[@onclick='newMsgWin()']"));
		
		//totWnds=new ArrayList<>(dr.getWindowHandles());
		//dr.switchTo().window(totWnds.get(1));
		windowHelper.switchToWindow(1);
		buttonHelper.click(By.linkText("Decision Models"));
		//dr.close();
		//dr.switchTo().window(totWnds.get(0));
		//dr.switchTo().defaultContent();
		windowHelper.switchToParentWithClose();
		buttonHelper.click(By.xpath("//button[@onclick='newBrwWin()']"));
		Thread.sleep(4000);
		
	    
	}

	@Then("I close window browser")
	public void i_close_window_browser() {
	    // Write code here that turns the phrase above into concrete actions
		if(dr!=null)
			dr.quit();
	    
	}

	
	
}
