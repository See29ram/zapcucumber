package com.udemy.pageclasses;

import org.openqa.selenium.WebDriver;

import com.udemy.drivers.DriverService;
import com.udemy.utils.ReadConfig;
import com.udemy.utils.TestSettings;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZapposStepDefnAnother {

	private WebDriver dr;
	private DriverService driverService;
	private ReadConfig readConfig;
	private HomePage homePage;
	private LoginPage loginPage;
	private UserSearchPage usersearchPage;
	private TestSettings testSettings;
	private SearchResultPage searchResultpg;

	public ZapposStepDefnAnother(DriverService driverService, TestSettings testSettings) {
		this.driverService = driverService;
		this.testSettings = testSettings;
		dr = driverService.getDriver();
	}

	@When("Zappos_User Clicked on Sigin and Navigate to Login Page")
	public void zappos_user_Clicked_on_Sigin_and_Navigate_to_Login_Page() {
		// Write code here that turns the phrase above into concrete actions
		testSettings.loginPage = (LoginPage) testSettings.homePage.navigateLoginPage();
	}

	@When("Zappos_User provide credentials and Navigate to User Search Page")
	public void zappos_user_provide_credentials_and_Navigate_to_User_Search_Page() {
		// Write code here that turns the phrase above into concrete actions
		testSettings.usersearchPage = (UserSearchPage) testSettings.loginPage
				.SiginZappos(driverService.getIreader().getUserName(), driverService.getIreader().getPassword());
	}

	@When("Zappos_User Search Product {string}")
	public void zappos_user_Search_Product(String product) {
		// Write code here that turns the phrase above into concrete actions
		testSettings.searchResultpg = (SearchResultPage) testSettings.usersearchPage.searchProduct(product);
	}

	@Then("Zappos_User Search result should be displayed")
	public void zappos_user_Search_result_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(testSettings.searchResultpg.getItemCount());
		System.out.println(testSettings.data);
		testSettings.homePage.logOut();
		//dr.quit();
	}

}
