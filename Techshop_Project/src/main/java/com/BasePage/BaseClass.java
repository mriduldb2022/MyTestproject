package com.BasePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// Static variables are outside the methods and inside the class
	public static WebDriver driver;
	public static Properties property;
	public static Logger logger;

	public BaseClass() {
		logger = Logger.getLogger("Automation Testing");
		PropertyConfigurator.configure("src/test/resources/Log4j.properties");
	}

	public static void initializeProperties() {

		try {

			property = new Properties();
			InputStream ip = new FileInputStream("src/test/resources/config.properties");
			property.load(ip);

		} catch (IOException error) {
			error.printStackTrace();
			System.out.println("Can't find the file");

		} catch (Exception error) {
			error.getMessage();

		} finally {
			System.out.println("This code will always run");
		}
	}

	public static void setUp() {
		if (property.getProperty("BrowserType").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
			driver = new ChromeDriver();

		} else if (property.getProperty("BrowserType").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (property.getProperty("BrowserType").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // This is delete user session information
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.smarttechqa.com/");

		/*
		 * using ID:
		 * driver.findElement(By.id("email")).sendKeys("testusermridul@email.com");
		 * 
		 * using Xpath: driver.findElement(By.xpath("//input[@type='email']")).sendKeys(
		 * "testusermridul@email.com");
		 * 
		 * using id: driver.findElement(By.id("password")).sendKeys("1234567");
		 * 
		 * using CssSelector:
		 * driver.findElement(By.cssSelector("#password")).sendKeys("1234567");
		 * 
		 * using xpath
		 * driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 * 
		 * 
		 * printing out the Title to verify automation is working and it logged in.
		 * System.out.println("The Title of the application is : " + driver.getTitle());
		 * 
		 * 
		 * 
		 * 
		 * driver.findElement(By.linkText("Go Back")).click(); //this will take me back
		 * to the home page from the cart page
		 * driver.findElement(By.partialLinkText("Go")).click();
		 * 
		 * 
		 * driver.navigate().back(); //This takes to previous page
		 * driver.navigate().refresh(); //This will click on the refresh button and
		 * refresh driver.navigate().to("https://www.smarttechqa.com/login"); //Takes to
		 * the url
		 * 
		 * Closing the browser driver.quit();
		 * 
		 */

	}

	public static void main(String[] args) {

	BaseClass.setUp(); //USING CLASSNAME to CALL the method to run it.

	}
}
