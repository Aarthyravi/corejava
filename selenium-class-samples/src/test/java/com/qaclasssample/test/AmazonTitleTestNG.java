package com.qaclasssample.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AmazonTitleTestNG {
	WebDriver driver = null;

  @BeforeTest
  public void setUp() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  //step2: Open the url
	  driver.get("https://www.amazon.com");
  }
	
  @Test
  public void testWithCorrectData() {
	  Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
  }
  
  
  @AfterTest
  public void cleanUp() {
	//step6: close the driver
    driver.close();

  }

}