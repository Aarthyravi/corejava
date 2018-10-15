package com.qaclasssample.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTitleTest {

	public static void main(String[] args) {
		//step1: Create the driver 
		//Download Firefox 46-->https://ftp.mozilla.org/pub/firefox/releases/46.0.1/win64/en-US/
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//step2: Open the url
		driver.get("https://www.amazon.com");
		//step3: set the data
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
				
		//step4: perform and action
		String actualTitle = driver.getTitle();
		
		//step5: validate the data
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		}else {
			System.out.println("Test Failed!");
		}
		
		//step6: close the driver
		driver.close();

	}
}