package com.udemy.typereg;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\typereg\\TypeRegis.feature"},
glue= {"com.udemy.typereg"},
dryRun = false,
monochrome = true)
public class TypeRunner extends AbstractTestNGCucumberTests{

}
