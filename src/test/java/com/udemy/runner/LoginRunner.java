package com.udemy.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\LearnCucumber\\Login.feature"},
glue= {"com.udemy.stepdefn"},
dryRun = false,
monochrome = true)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
