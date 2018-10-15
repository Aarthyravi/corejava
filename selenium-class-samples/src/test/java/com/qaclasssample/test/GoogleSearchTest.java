package com.qaclasssample.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		//step1: Create the driver 
		//Download Firefox 46-->https://ftp.mozilla.org/pub/firefox/releases/46.0.1/win64/en-US/
		WebDriver driver = new FirefoxDriver();
		//step2: Open the url
		driver.get("https://www.google.com");
		//step3: set the data
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("java book");
		Thread.sleep(3000);
		//step4: perform and action
		WebElement searchbtn = 	driver.findElement(By.name("btnK"));
		searchbtn.click();
		//step5: validate the data
		String title = driver.getTitle();
		//String url = driver.getCurrentUrl();
		if(title.equals("java book - Google Search")) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		//step6: close the driver
		driver.close();

	}
}