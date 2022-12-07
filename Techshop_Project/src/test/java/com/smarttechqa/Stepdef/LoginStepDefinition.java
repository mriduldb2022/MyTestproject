package com.smarttechqa.Stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BasePage.BaseClass;
import com.Utils.Utilities;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@Given("User opens the browser")
	public void user_opens_the_browser() {
	   //BaseClass.setUp();
	    
	}

	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {
	   
	    
	}

	@When("User Clicks on the sign in button")
	public void user_clicks_on_the_sign_in_button() {
		pf.getLoginButton().click();
		
	  // driver.findElement(By.xpath("//a[@href='/login']")).click();
	 //driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
	}

	@When("User Enters the email")
	public void user_enters_the_email() throws IOException {
		pf.getEmail().sendKeys("testusermridul@email.com");
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testusermridul@email.com");
	   // Utilities.getHighLighter(driver.findElement(By.xpath("//input[@type='email']")));
	   // Utilities.takeScreenShot();
	    
	}

	@When("User Eneters the password")
	public void user_eneters_the_password() {
		pf.getPassword().sendKeys("1234567");
		
		//driver.findElement(By.id("password")).sendKeys("1234567");
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
		System.out.println("The Title of the application is : " + driver.getTitle()); //To verify if you logged in
			
		
	}
	
	@When("User clicks on the Search Box and searches for {string}")
	public void user_clicks_on_the_search_box_and_searches_for(String string) {
		Utilities.getExplicitWait(driver.findElement(By.name("q")), 10);
	    driver.findElement(By.name("q")).sendKeys("item");//.sendKeys(string); //.................????? sendKeys.(item)??????????????????????????????????
	    
	}
	@When("User clicks on the Search button")
	public void user_clicks_on_the_search_button() {
	    driver.findElement(By.name("q")).submit();
	    
	}
	@Then("User can search for the {string} item")
	public void user_can_search_for_the_item(String string) {
	    
	    
	}
	@Then("User can search for the {string} it")
	public void user_can_search_for_the_it(String string) {
	   
	  
	}

	
	
	@When("User clicks on the latest product from the homepage")
	public void user_clicks_on_the_latest_product_from_the_homepage() {
	   
	  
	}

	@Then("User is able to view the item")
	public void user_is_able_to_view_the_item() {
	   
	  
	}

	
	
	@When("User clicks on the cart button")
	public void user_clicks_on_the_cart_button() {
		Utilities.getExplicitWait(driver.findElement(By.xpath("//a[@href='/cart']")),5);
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
	  
	}

	@Then("User is navigated to the cart button")
	public void user_is_navigated_to_the_cart_button() {
	   
	  
	}

	@Then("I can validate user payment")
	public void i_can_validate_user_payment() {
	   
	  
	}

	@Then("I want to check user is able to pay for the item")
	public void i_want_to_check_user_is_able_to_pay_for_the_item() {
	   
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
