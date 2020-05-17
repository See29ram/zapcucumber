package com.udemy.windowhandle;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\windowhandle\\window.feature"},
glue= {"com.udemy.windowhandle"},
dryRun = false,
monochrome = true)
public class WindowRunner extends AbstractTestNGCucumberTests {

}
