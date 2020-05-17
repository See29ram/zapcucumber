package com.udemy.datadriven;

import java.util.Arrays;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\datadriven\\Datadriven.feature"},
glue= {"com.udemy.datadriven"},
dryRun = false,
monochrome = true)

public class DataRunner extends AbstractTestNGCucumberTests{

}
