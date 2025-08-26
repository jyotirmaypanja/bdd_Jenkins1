package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Features/Login.feature",
	    glue = {"StepDefinations","Hooks"},
	    tags = "@sanity",
	    plugin = {
	        "pretty",
	        "html:target/cucumber-html-report",
	        "json:target/cucumber.json",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  
	    }
	)

public class MyTestRunner  extends AbstractTestNGCucumberTests {

}

/*
features = {"src/test/resources/Features/login.feature"}
,glue = {"StepDefinitions","Hooks"},
tags = "@sanity",
plugin = {"pretty","html:target/cucumber-reports.html"},
monochrome = true*/