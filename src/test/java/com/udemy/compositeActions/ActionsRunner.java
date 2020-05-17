package com.udemy.compositeActions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\compositeActions\\Actions.feature"},
glue= {"com.udemy.compositeActions","com.udemy.hooks"},
dryRun= false,
monochrome = true)
public class ActionsRunner extends AbstractTestNGCucumberTests{

}
