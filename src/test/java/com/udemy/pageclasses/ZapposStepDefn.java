package com.udemy.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

import java.util.List;
import java.util.Map;

import com.udemy.drivers.DriverService;
import com.udemy.factory.PageType;
import com.udemy.utils.ReadConfig;
import com.udemy.utils.TestSettings;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZapposStepDefn {

	private WebDriver dr;
	private DriverService driverService;
	private ReadConfig readConfig;
	private HomePage homePage;
	private LoginPage loginPage;
	private UserSearchPage usersearchPage;
	private SearchResultPage searchResultpg;
	private TestSettings testSettings;

	public ZapposStepDefn(DriverService driverService, TestSettings testSettings) {
		this.driverService = driverService;
		this.testSettings = testSettings;
		dr = driverService.getDriver();
	}

	@Given("User landed at HomePage")
	public void user_landed_at_HomePage() {
		// Write code here that turns the phrase above into concrete actions
		dr.get(driverService.getIreader().getAppUrl());
		testSettings.homePage = new HomePage(dr);
		testSettings.data = "Data from first stepdefn";

		
			
		

	}

	@When("User Clicked on Sigin and Navigate to Login Page")
	public void user_Clicked_on_Sigin_and_Navigate_to_Login_Page() {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(dr.getCurrentUrl(), "https://www.zappo.com/");
		testSettings.loginPage = (LoginPage) testSettings.homePage.navigateLoginPage();
	}

	@When("User provide credentials and Navigate to User Search Page")
	public void user_provide_credentials_and_Navigate_to_User_Search_Page() {
		// Write code here that turns the phrase above into concrete actions
		testSettings.usersearchPage = (UserSearchPage) testSettings.loginPage
				.SiginZappos(driverService.getIreader().getUserName(), driverService.getIreader().getPassword());
	}

	@When("User Search Product {string}")
	public void user_Search_Product(String product) {
		// Write code here that turns the phrase above into concrete actions
		testSettings.searchResultpg = (SearchResultPage) testSettings.usersearchPage.searchProduct(product);

	}

	@Then("Product Search result should be displayed")
	public void product_Search_result_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println(testSettings.searchResultpg.getItemCount());
		testSettings.homePage.logOut();
		// dr.quit();
	}

	@When("I Click on Favorites")
	public void i_Click_on_Favorites() {
		// Write code here that turns the phrase above into concrete actions
		testSettings.homePage.eleFavorites.click();
		testSettings.favorites = (Favorites) testSettings.homePage.getPageInstance(PageType.Favorites, dr,
				testSettings.homePage.eleFavorites);
	}

	@When("I Click On Home Page")
	public void i_Click_On_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		testSettings.favorites.homeZappos.click();
		;
		testSettings.homePage = (HomePage) testSettings.favorites.getPageInstance(PageType.HomePage, dr,
				testSettings.favorites.homeZappos);
		testSettings.homePage.logOut();
	}
	
	@When("Click on Register")
	public void click_on_Register() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("createAccountSubmit")).click();
	}

	@When("Register Users")
	public void register_Users(io.cucumber.datatable.DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> data=table.asMaps(String.class,String.class);
		Map<String,String> firstData=data.get(0);
		
		String userName=firstData.get("Name");
		String userEmail=firstData.get("Email");
		dr.findElement(By.id("ap_customer_name")).sendKeys(userName);
		dr.findElement(By.id("ap_email")).sendKeys("userEmail");
		dr.findElement(By.id("continue"));
		System.out.println(data.get(1));
	   
	}

}
