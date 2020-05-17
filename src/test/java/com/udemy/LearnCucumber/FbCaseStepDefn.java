package com.udemy.LearnCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.udemy.browser.CustomChrome;
import com.udemy.browser.CustomFireFox;
import com.udemy.helper.BrowserHelper;
import com.udemy.helper.ButtonHelper;
import com.udemy.helper.DropdownHelper;
import com.udemy.helper.TextBoxHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FbCaseStepDefn {

	WebDriver dr;
	WebElement emailField;
	BrowserHelper browserHelper;
	TextBoxHelper textboxHelper;
	ButtonHelper buttonHelper;
	DropdownHelper dropdownHelper;

	@Given("When I launch {string}")
	public void when_I_launch(String url) {
		// Write code here that turns the phrase above into concrete actions
//		ChromeOptions opt=new ChromeOptions();
//		opt.setAcceptInsecureCerts(true);
//		opt.setHeadless(true);
//		System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
		//CustomChrome chrome=new CustomChrome();
		//dr = chrome.getChromeDriver();
		CustomFireFox firefox=new CustomFireFox();
		//dr=firefox.getFirefoxDriver();
		dr.get(url);
		browserHelper = BrowserHelper.getInstance(dr);
		textboxHelper = TextBoxHelper.getInstance(dr);
		browserHelper.maximize();
		buttonHelper = ButtonHelper.getInstance(dr);
		dropdownHelper=DropdownHelper.getInstance(dr);
		
	}

	@When("I enter UserName as {string}")
	public void i_enter_UserName_as(String emailId) {
		// Write code here that turns the phrase above into concrete actions
		// emailField = dr.findElement(By.id("email"));
		// emailField.sendKeys(emailId);
		textboxHelper.setText(By.id("email"), "abcde");

	}

	@When("I get UserName field text")
	public void i_get_UserName_field_text() {
		// Write code here that turns the phrase above into concrete actions
		// String getEmail = emailField.getText();
		// System.out.println(getEmail);

		System.out.println(textboxHelper.getText(By.id("email")));

	}

	@When("I clear UserName fiels")
	public void i_clear_UserName_fiels() {
		// Write code here that turns the phrase above into concrete actions
		// emailField.clear();
		textboxHelper.clearText(By.id("email"));
	}

	@When("I Click On Login")
	public void i_Click_On_Login() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// dr.findElement(By.xpath("//input[starts-with(@id,'u_') and @value='Log
		// In']")).click();
		buttonHelper.click(By.xpath("//input[starts-with(@id,'u_') and @value='Log In']"));
		Thread.sleep(3000);
		browserHelper.moveBack();
	}

	@When("I Select Gender")
	public void i_Select_Gender() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// dr.findElement(By.xpath("//label[text()='Male']//preceding-sibling::input")).click();
		buttonHelper.click(By.xpath("//label[text()='Male']//preceding-sibling::input"));
		Thread.sleep(3000);
	}

	@When("I Click New Page")
	public void i_Click_New_Page() {
		// Write code here that turns the phrase above into concrete actions
		// dr.findElement(By.linkText("Create a Page")).click();
		buttonHelper.click(By.linkText("Create a Page"));
	}

	@When("I Enter Date as Index")
	public void i_Enter_Date_as_Index() {
		// Write code here that turns the phrase above into concrete actions
		//Select select = new Select(dr.findElement(By.id("day")));
		//select.selectByIndex(5);
		dropdownHelper.SelectByIndex(By.id("day"), 5);
	}

	@When("I Enter Month as Value")
	public void i_Enter_Month_as_Value() {
		// Write code here that turns the phrase above into concrete actions
		//Select select = new Select(dr.findElement(By.id("month")));
		//select.selectByValue("8");
		dropdownHelper.SelectByValue(By.id("month"), "8");
	}

	@When("I Enter Year as Visible Text")
	public void i_Enter_Year_as_Visible_Text() {
		// Write code here that turns the phrase above into concrete actions
		//Select select = new Select(dr.findElement(By.id("year")));
		//select.selectByVisibleText("2000");
		dropdownHelper.SelectByVisibleText(By.id("year"), "2000");
	}

	@When("I Get All Option from Year")
	public void i_Get_All_Option_from_Year() {
		// Write code here that turns the phrase above into concrete actions
		//Select select = new Select(dr.findElement(By.id("year")));
		//System.out.println(select.getOptions().size());
		
		System.out.println(dropdownHelper.getAllOptions(By.id("year")).size());
	}

	@When("I quit browser")
	public void i_quit_browser() {
		// Write code here that turns the phrase above into concrete actions
		if (dr != null)
			dr.quit();

	}

}
