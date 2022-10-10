package com.smarttechqa.Stepdef;

import org.openqa.selenium.By;

import com.BasePage.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginStepDefination extends BaseClass {

	@Given("I open the browser and I navigate to the application")
	public void i_open_the_browser_and_i_navigate_to_the_application() {
		 BaseClass.setUp();
	 
	}

	@When("I click on the sign in button on the homepage")
	public void i_click_on_the_sign_in_button_on_the_homepage() {
		  driver.findElement(By.xpath("//a[@href='/login']")).click();
	 
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String email, String password) {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	 
	}

	@Then("I am suppose to get an error message")
	public void i_am_suppose_to_get_an_error_message() {
	   
	 
	}
}
