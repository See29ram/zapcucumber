package com.udemy.alerts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src\\test\\java\\com\\udemy\\alerts\\alert.feature"},
glue= {"com.udemy.alerts"},
dryRun = false,
monochrome = true)
public class AlertRunner extends AbstractTestNGCucumberTests{

}
