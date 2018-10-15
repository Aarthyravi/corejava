package com.apex.ecommerce.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver = null;
	String baseUrl = "http://ecommerce.saipratap.net/customerlogin.php";
	
  @BeforeTest
  public void setUp() {
	  driver = BrowserFactory.getDriver("ff");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
   }
  
  @AfterTest
  public void cleanUp() {
	  driver.close();
  }

}
