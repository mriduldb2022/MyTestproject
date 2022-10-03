package com.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
public static void setUp(){
		
		//FIREFOX DRIVER:
		System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smarttechqa.com/");
		
	}
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
		
	}
}
