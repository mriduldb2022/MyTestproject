package com.smarttechqa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/"}, // Location of the feature files(folder name!) 
		glue = {"com.smarttechqa.Stepdef"}, // Location of StepDef (package name!) 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = true, //False-it will open all browser
		monochrome = true
			
		)
public class FeatureRunner extends AbstractTestNGCucumberTests {

}
