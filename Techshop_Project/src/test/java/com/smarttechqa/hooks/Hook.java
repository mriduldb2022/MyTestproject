package com.smarttechqa.hooks;


import com.BasePage.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass{

	
	
	//Initialize Starts the Browser before every scenario 
	@Before
	public static void initialize() {
	//	BaseClass.initializeProperties();
		BaseClass.setUp();
		
	}
	
	
	
	
	//TearDown will quit the Browser after every scenario 
	@After
	public static void tearDown() {		
		driver.quit();
		
	}
}
