package com.ecommercetestng.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseOrderProcessingTest {

	protected WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		  driver = new FirefoxDriver();
	  }

	@AfterTest
	public void cleanUp() {
		  driver.close();
	  }

}
