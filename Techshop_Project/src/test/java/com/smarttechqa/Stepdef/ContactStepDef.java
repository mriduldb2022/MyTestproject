package com.smarttechqa.Stepdef;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BasePage.BaseClass;
import com.Utils.Utilities;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactStepDef extends BaseClass {

	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
	@When("User clicks on the Contact Us Page")
	public void user_clicks_on_the_contact_us_page() {
	    driver.findElement(By.xpath("//*[@href='/contact']")).click();
	    
	}

	@When("User clicks on Monday and Tuesday selection")
	public void user_clicks_on_monday_and_tuesday_selection() throws InterruptedException {
	    Select days = new Select(driver.findElement(By.id("days")));
	    days.selectByValue("Monday");
	    days.selectByVisibleText("Tuesday");
	    Thread.sleep(5000);
	}

	@Then("Monday and Tuesday are selected")
	public void monday_and_tuesday_are_selected() {
	    
	}

	@When("User clicks on Morning and Afternoon checkboxes")
	public void user_clicks_on_morning_and_afternoon_checkboxes() {
		Utilities.clickCheckBox(driver.findElement(By.xpath("//*[text()='Morning']")));
	    Utilities.clickCheckBox(driver.findElement(By.xpath("//*[text()='Afternoon']")));
	   
	}

	@Then("Morning and Afternoon checkboxes are selected")
	public void morning_and_afternoon_checkboxes_are_selected() {
	    
	   
	}

	@Then("Evening checkboxes is not selcted")
	public void evening_checkboxes_is_not_selcted() {
	    
	   
	}

	@When("User opens a new tab window")
	public void user_opens_a_new_tab_window() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.open()");
	   Thread.sleep(5000);
	}

	@Then("User switches to the new tab window and close and switch back to the old tab")
	public void user_switches_to_the_new_tab_window_and_close_and_switch_back_to_the_old_tab() {
		//Multiple window handling- First I store the multiple window in the ArrayList with driver
		//then I switch to the new window with driver,switch to method
		//then I close the new window
		//Finally I witch back to the original window with driver.switchto method.
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	   
	}
}
