package com.smarttechqa.Stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.BasePage.BaseClass;
import com.Utils.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
	@Given("User opens the browser")
	public void user_opens_the_browser() {
	   BaseClass.setUp();
	    
	}

	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {
	   
	    
	}

	@When("User Clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() {
	   driver.findElement(By.xpath("//a[@href='/login']")).click();
	 //driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
	}

	@When("User Enters the email")
	public void user_enters_the_email() throws IOException {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testusermridul@email.com");
	    Utilities.getHighLighter(driver.findElement(By.xpath("//input[@type='email']")));
	    Utilities.takeScreenShot();
	    
	}

	@When("User Eneters the password")
	public void user_eneters_the_password() {
		driver.findElement(By.id("password")).sendKeys("1234567");
		//driver.findElement(By.cssSelector("#password")).sendKeys("123456");
	}
	@When("User Clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	}
	@Then("The user is successfully logged in and username is displayed")
	public void the_user_is_successfully_logged_in_and_username_is_displayed() {
	   
	    //This step is used for Verification
		//We have to match the Expected with the Actual 
		
		//For Expected already know the username, so we can store it in a string
		
		String expected = "TEST USERMRIDUL";
		String actual = driver.findElement(By.id("username")).getText();	
		
		//Use the Assert class from the TestNG, There are static methods in the Assert Class.
		//One of the static method is assertEquals.
		Assert.assertEquals(actual, expected);	
		
	}
	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("The Title of the application is : " + driver.getTitle());
		
		
		
		
		
		
		
		
		
	}
	
	@When("User clicks on the Search Box and searches for {string}")
	public void user_clicks_on_the_search_box_and_searches_for(String string) {
	    
	    
	}
	@When("User clicks on the Search button")
	public void user_clicks_on_the_search_button() {
	    
	    
	}
	@Then("User can search for the {string} item")
	public void user_can_search_for_the_item(String string) {
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
