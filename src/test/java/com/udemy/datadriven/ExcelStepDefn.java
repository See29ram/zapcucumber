package com.udemy.datadriven;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExcelStepDefn {

	
	@Given("Logint to Website {string}")
	public void logint_to_Website(String site) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(site);
	}

	@When("enter username {string}")
	public void enter_username(String uid) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(uid);
	}

	@When("enter password {string}")
	public void enter_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(pwd);
	}

	
}
