package com.udemy.iframes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\iframes\\frames.feature"},
glue= {"com.udemy.iframes"},
dryRun = false,
monochrome = true)
public class FrameRunner extends AbstractTestNGCucumberTests{

}
