package com.udemy.LearnCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBstepdefn {

	BaseClass base;
	
	public FBstepdefn(BaseClass base)
	{
		this.base=base;
		
	}
	
	@Given("User Logged in Facebook")
	public void user_Logged_in_Facebook() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logged In Facebook "+base.getFeatureName());
	}

	@When("User Click On Post")
	public void user_Click_On_Post() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Message On Wall Poster");
	}

	@Then("Post Should be Displayed On wall")
	public void post_Should_be_Displayed_On_wall() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Message Displayed in wall");
	}

	@When("User Click on Post Video")
	public void user_Click_on_Post_Video() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("clicking on to post video");
	}

	@Then("Post Video should apper On Wall")
	public void post_Video_should_apper_On_Wall() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Video appeared on wall");
	}

	@Given("Type Message as {string} On Post Wall")
	public void type_Message_as_On_Post_Wall(String msg) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Message Posted as-"+msg);
	}

	@Given("Upload Video from {string} on Wall")
	public void upload_Video_from_on_Wall(String videoMsg) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Video Uploaded from "+videoMsg);
	}

}
