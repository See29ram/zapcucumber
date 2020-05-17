package com.udemy.webdriverswaits;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\webdriverswaits\\LetsWait.feature"},
glue= {"com.udemy.webdriverswaits"},
dryRun = false,
monochrome = true)
public class WaitRunner extends AbstractTestNGCucumberTests {

}
