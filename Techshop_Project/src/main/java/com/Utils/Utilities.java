package com.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePage.BaseClass;

public class Utilities extends BaseClass {

	public static WebElement getExplicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);                    //Webdrive is an interface.
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elem;
	}
	
	//Clicking challenge: 
	
	//Action is not an interface, its is a class from selenium
	//If we can not click an element using regular selenium webdriver interface then use action class click 
	
	public static void actionClick () {
		Actions action = new Actions(driver);
		action.click().build().perform();
	}
	
	// JavaScript Executor - Casting : FOR CLICKING: 
	public static void jsClick (WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver; //CASTING 
		executor.executeScript("arguments[0].click();", element);
	}
	
	// JavaScript Executor - Casting : FOR SCROLL IN TO VIEW : 
	public static void elementScroll(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver; //CASTING 
		executor.executeScript("arguments[0].scrollIntoView", element);
		
	}
	// JavaScript Executor - Casting : FOR scroll to bottom page : 
	
	
	
}
