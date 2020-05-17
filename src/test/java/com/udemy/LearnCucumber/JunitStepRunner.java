package com.udemy.LearnCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\udemy\\LearnCucumber\\FBPost.feature"},
glue= {"com.udemy.LearnCucumber"})
public class JunitStepRunner {

}
