package com.smarttechqa.Stepdef;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.BasePage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportingStepDef extends BaseClass{

	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@Given("User clicks on Reports button")
	public void user_clicks_on_reports_button() {
	 // driver.findElement(By.id("username")).click();
	 // driver.findElement(By.linkText("Reports")).click();
		driver.get("https://www.smarttechqa.com/reports");
	   
	}

	@When("User uploads a file")
	public void user_uploads_a_file() {
	  
	   
	}

	@Then("The attribute {string} is displayed")
	public void the_attribute_is_displayed(String string) {
	  
	   
	}

	@When("User clicks on Upload button")
	public void user_clicks_on_upload_button() {
	  driver.findElement(By.id("uploadfile")).click();
	   
	}

	@When("User Enters Name and User clicks on OK button")
	public void user_enters_name_and_user_clicks_on_ok_button() throws InterruptedException {
	  Alert alert = driver.switchTo().alert();
	  Thread.sleep(5000);
	  alert.sendKeys("Mridul");
	  Thread.sleep(5000);
	  alert.accept(); // okay button is accept
	  Thread.sleep(5000);
	
	   
	}

	@Then("Message {string} is displayed")
	public void message_is_displayed(String string) {
	  
	   
	}


	@When("User cancles the alert")
	public void user_cancles_the_alert() throws InterruptedException {
		  Alert alert = driver.switchTo().alert();
		  Thread.sleep(5000);
		  alert.dismiss(); // cancel is dismiss
		  Thread.sleep(5000);
	   
	}

	@Then("Message {string} is displayed on screen")
	public void message_is_displayed_on_screen(String string) {
	  
	   
	}
}
