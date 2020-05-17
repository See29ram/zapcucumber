package com.udemy.LearnCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UdemyTest {

	
	public UdemyTest(UdemyDriver udr)
	{
		System.out.println(udr.hashCode());
	}
	
	
	@Given("Navigate to Udemy Site")
	public void navigate_to_Udemy_Site() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Navigtion to Udemy done");
	}

	@Given("Enter User Id and Password")
	public void enter_User_Id_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Enter UserId and Password done");
	}

	@Given("Click On Login")
	public void click_On_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Clicked On Login");
	}

	@Then("User Home Page Should be displayed")
	public void user_Home_Page_Should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home Page Displayed");
	}
	@Given("Navigate to Course Name")
	public void navigate_to_Course_Name() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Navigated to desired course");
	}

	@Then("Buy the course")
	public void buy_the_course() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Purchasing the required course");
	}

	
}
