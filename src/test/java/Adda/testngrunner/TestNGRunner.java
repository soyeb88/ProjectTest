package Adda.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Feature",
		glue = "com.stepdefinitions"
		)

public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	
}
