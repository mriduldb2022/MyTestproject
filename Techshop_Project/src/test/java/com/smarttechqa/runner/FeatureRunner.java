package com.smarttechqa.runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.BasePage.BaseClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/Cart.feature"}, // Location of the feature files(folder name!) 
		glue = {"com.smarttechqa.Stepdef", "com.smarttechqa.hooks"}, // Location of(package name!) 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false, 						//False-it will open all browser
		monochrome = true
											//tags = "@smoke, @Regression"
			
		)
public class FeatureRunner extends AbstractTestNGCucumberTests {
	@BeforeClass
	@Parameters("browserType")
	public static void beforeClass(@Optional("chrome") String browser) throws IOException {
		new BaseClass();
		BaseClass.initializeProperties();
		BaseClass.property.setProperty("BrowserType", browser);
	}
	
	
	
	@AfterClass
	public static void afterClass() {
		
	}
}
