package com.udemy.LearnCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\LearnCucumber\\Browser.feature"},
glue= {"com.udemy.LearnCucumber"},
dryRun=false,
monochrome = true)
public class BrowserRunner extends AbstractTestNGCucumberTests{

}
