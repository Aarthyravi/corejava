package com.qaclasssample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TargetOrderProcessing {

	public static void main(String[] args) throws InterruptedException {
		
		//step1: Create the driver 
		WebDriver driver = new FirefoxDriver();
				
		//step2: Open the url
		driver.get("https://www.target.com/");
		Thread.sleep(2000);
		
		//step3: set the data
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("5xtbp")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("4ylcv")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("5xtbm")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("5xtbi")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("SUGARFIX by BaubleBar Miniature Tassel Drop Earrings")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'view cart & checkout')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'I’m ready to check out')]")).click();
		Thread.sleep(2000);
		
		//step4: validate
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.target.com/co-login?interstitial=true&redirectToURL=co-deliverymethod";
		if (actualUrl.contentEquals(expectedUrl))
			System.out.println("Test Passed!");
		else
			System.out.println("Test Failed!");
		
		//step5: close the driver
		driver.close();

	}

}
