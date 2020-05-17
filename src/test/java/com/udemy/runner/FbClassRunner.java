package com.udemy.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\LearnCucumber\\FbCase.feature"},
glue= {"com.udemy.LearnCucumber"},
dryRun = false,
monochrome = true)
public class FbClassRunner extends AbstractTestNGCucumberTests{

}
