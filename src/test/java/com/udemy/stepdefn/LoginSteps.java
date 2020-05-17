package com.udemy.stepdefn;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User Login Page")
	public void user_Login_Page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User Loggin");
	}

	@When("I enter UserName and Password")
	public void i_enter_UserName_and_Password(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
//		List<List<String>> users = dataTable.asLists();
//
//		for (List<String> a : users) {
//			System.out.println(a.get(0));
//			System.out.println(a.get(1));
//		}

		Map<String, String> m = dataTable.asMap(String.class, String.class);
		for (String s : m.keySet()) {
			System.out.println(String.format("Key value is %s and Value is %s", s, m.get(s)));
		}

	}

	@Then("Home Page Should be displayed")
	public void home_Page_Should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home page entered");
	}

	@Given("WebSite {string}")
	public void website(String site) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(site);
	}

	@Given("Present in {string}")
	public void present_in(String city) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(city);
	}

	@Then("check {string} is the output")
	public void check_is_the_output(String tech) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(tech);
	}

}
