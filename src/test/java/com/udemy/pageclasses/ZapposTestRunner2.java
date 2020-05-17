package com.udemy.pageclasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\pageclasses\\zappostest.feature"},
glue= {"com.udemy.pageclasses","com.udemy.hooks"},
dryRun=false,
monochrome = true,
plugin = {"pretty","html:target/HTMLReport","json:target/JsonReport/jsonreport.json"})
public class ZapposTestRunner2 extends AbstractTestNGCucumberTests{

}
