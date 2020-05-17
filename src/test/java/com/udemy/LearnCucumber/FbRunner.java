package com.udemy.LearnCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\com\\udemy\\LearnCucumber\\FBPost.feature",
glue= {"com.udemy.LearnCucumber","com.udemy.hooks"},
dryRun = false,
monochrome = true)
public class FbRunner extends AbstractTestNGCucumberTests{

}
