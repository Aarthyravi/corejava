package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceOrderProcessingTest {

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
		Thread.sleep(2000);
		
		driver.get("http://ecommerce.saipratap.net/products.php");
		driver.findElement(By.linkText("Electronics")).click();
		Thread.sleep(2000);
		// View the category page on category.php 
		driver.findElement(By.linkText("Computers")).click();
		Thread.sleep(2000);
		// click the view Item for the 4th product on the right menu on 'products.php' page
		driver.findElement(By.cssSelector("a[href='proddetail.php?proid=10002']")).click();
		Thread.sleep(2000);
		// click on Add to Cart button on proddetail.php page
		driver.findElement(By.cssSelector("input[type='image']")).click();
		Thread.sleep(2000);
		//click on Checkout button on cart.php page
		driver.findElement(By.cssSelector("a[class='continue']")).click();
		Thread.sleep(2000);
		//checkpersonal details page
		driver.findElement(By.cssSelector("a[href='checkoutshiping.php']")).click();
		Thread.sleep(2000);
		//under the Postage menu on checkoutShipping.php
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(2000);
		//click on continue button on 'postage' menu bar 
		
		driver.findElement(By.cssSelector("img[src ='images/continue.gif']")).click();
		Thread.sleep(2000);
		//click on continue button on 'Pay' code menu bar		
		driver.findElement(By.cssSelector("img[src ='images/continue.gif']")).click();
		Thread.sleep(2000);
		//click on continue button on 'Discount codes' menu bar
		driver.findElement(By.cssSelector("img[src ='images/continue.gif']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		//step5: validate 
		String actualTitle = driver.getTitle();
		String expectedUrl = "Log in to your account";
		if(actualTitle.contentEquals(expectedUrl))
			System.out.println("Test Passed!");
		else
			System.out.println("Test Failed!");
		
		//step6: close the driver
		driver.close();

	}

}