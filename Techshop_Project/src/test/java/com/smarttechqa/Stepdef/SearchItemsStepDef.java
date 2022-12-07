package com.smarttechqa.Stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BasePage.BaseClass;
import com.smarttechqa.elements.ElementPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchItemsStepDef extends BaseClass {
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	

	@When("User enters the keywords {string}")
	public void user_enters_the_keywords(String string) {
	    pf.getSearch().sendKeys("airpod");
	    
	}

	@When("The user clicks on the Search button")
	public void the_user_clicks_on_the_search_button() {
	    pf.getSearchButton().click();
	    
	}

	@When("The user clicks on the item")
	public void the_user_clicks_on_the_item() {
	    pf.getAirpod().click();
	    
	}

	@Then("The user is navigated to the {string} item page")
	public void the_user_is_navigated_to_the_item_page(String string) {
	    String expected = "Airpods Wireless Bluetooth Headphones";
	    String actual = pf.getAirpodsPage().getText();
	    Assert.assertEquals(actual, expected);
	    
	    
	}

}
