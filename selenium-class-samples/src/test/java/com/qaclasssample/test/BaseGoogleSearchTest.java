package com.qaclasssample.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseGoogleSearchTest {
	WebDriver driver =null;
	
  @BeforeMethod
  public void setUp() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  // Open the url
	  driver.get("https://www.google.com");
  }
	  
  @AfterMethod
  public void cleanUp() {
	//close the driver
    driver.close();
  }

}