package com.BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	//Static variables are outside the methods and inside the class
	public static WebDriver driver;

public static void setUp(){
		
		//CHROMEDRIVER SETUP:
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://www.smarttechqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//using ID
		//driver.findElement(By.id("email")).sendKeys("testusermridul@email.com");  
		
		//using Xpath
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testusermridul@email.com");
		
		//using id
		driver.findElement(By.id("password")).sendKeys("1234567");
		
		//using CssSelector 
		//driver.findElement(By.cssSelector("#password")).sendKeys("1234567");
		
		//using xpath 
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		
		//printing out the Title to verify automation is working and it logged in.
		System.out.println("The Title of the application is : " + driver.getTitle());
		
		
		//driver.navigate().back(); //This takes to previous page 
		//driver.navigate().refresh(); //This will click on the refresh button and refresh
		//driver.navigate().to("https://www.smarttechqa.com/login"); Takes to the url 
		
		//Closing the browser
		//driver.quit();
	
	}
	
	public static void main(String[] args) {
		//USING CLASSNAME to CALL the method to run it. 
		BaseClass.setUp();
		
	}
}
