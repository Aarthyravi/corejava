package com.ecommerce.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//step1: Create the driver 
		WebDriver driver = new FirefoxDriver();
		//step2: Open the url
		driver.get("http://ecommerce.saipratap.net/customerlogin.php");
		driver.manage().window().maximize();
		
		//step3: set the data
		driver.findElement(By.id("email")).sendKeys("padma@gmail.com");
		driver.findElement(By.id("password")).sendKeys("star25");
				
		//step4: perform and action
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(500);
				
		//step5: Validate
		String actualText = driver.findElement(By.className("fntstyle")).getText();
        String expectedText = "You have Logged In successfully." ;
        if (actualText.contentEquals(expectedText))
        	System.out.println("Test Passed!");
        else
        	System.out.println("Test failed!");
        
		//step6: close the driver
	    driver.close();
	
	}

}