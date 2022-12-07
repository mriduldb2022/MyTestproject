package com.smarttechqa.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BasePage.BaseClass;

public class ElementPage extends BaseClass {

	public ElementPage(){ 								//Constructor
		PageFactory.initElements(driver, this); //Setting up the method
	}
	
	//How to store the elements
	//"Encapsulation" is our framework. WE want to make our elements private
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	@FindBy (xpath = "//input[@type='email']")
	@CacheLookup
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}

	@FindBy (id = "password" )
	@CacheLookup
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy (name = "q" )
	@CacheLookup
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}


	@FindBy (xpath = "//button[text()='Search']")
	@CacheLookup
	private WebElement SearchButton;

	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	@FindBy (xpath= "//*[text()='Airpods Wireless Bluetooth Headphones']")
	@CacheLookup
	private WebElement airpod;

	public WebElement getAirpod() {
		return airpod;
	}
	
	@FindBy(xpath = "(//*[text()='Airpods Wireless Bluetooth Headphones'])[2]")
	private WebElement airpodsPage;

	public WebElement getAirpodsPage() {
		return airpodsPage;
	}
	
	
	
}
