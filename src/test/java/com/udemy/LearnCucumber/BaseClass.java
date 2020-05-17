package com.udemy.LearnCucumber;

public class BaseClass {

	
	private String ScenarioName;
	public String getScenarioName() {
		return ScenarioName;
	}
	public String getFeatureName() {
		return FeatureName;
	}
	private String FeatureName;
	
	public BaseClass()
	{
		ScenarioName="Fb Scenario";
		FeatureName="FB Feature from Base Class";
	}
	
	
	
	
}
