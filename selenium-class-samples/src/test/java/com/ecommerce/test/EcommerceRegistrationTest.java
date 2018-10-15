package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceRegistrationTest {

	public static void main(String[] args) throws InterruptedException {
		
		//step1: Create the driver 
		WebDriver driver = new FirefoxDriver();
		
		//step2: Open the url
		driver.get("http://ecommerce.saipratap.net/customerlogin.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("ACCOUNT")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("SignUp")).click();
		
		//Step3: Set the data
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.id("fname")).sendKeys("Padma");
		driver.findElement(By.id("lname")).sendKeys("Cholla");
		driver.findElement(By.id("day")).sendKeys("15");
		driver.findElement(By.id("month")).sendKeys("03");
		driver.findElement(By.id("year")).sendKeys("1982");
		driver.findElement(By.id("email")).sendKeys("padma@gmail.com");
		driver.findElement(By.id("houseno")).sendKeys("8");
		driver.findElement(By.id("add1")).sendKeys("Halford");
		driver.findElement(By.id("city")).sendKeys("Santa Barbara");
		driver.findElement(By.id("state")).sendKeys("CA");
		driver.findElement(By.id("country")).sendKeys("USA");
		driver.findElement(By.id("postcode")).sendKeys("90580");
		driver.findElement(By.id("phone")).sendKeys("405890678");
		driver.findElement(By.id("fax")).sendKeys("20567890");
		driver.findElement(By.id("password")).sendKeys("star25");
		driver.findElement(By.id("cpassword")).sendKeys("star25");
		driver.findElement(By.id("terms")).click();
		Thread.sleep(1000);
		
		//step4: perform and action
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		
		//step5: validate
		String actualText = driver.findElement(By.cssSelector("span[class='msg']")).getText();
        String expectedText = "This email address is already registered.";
        if (actualText.contentEquals(expectedText))
        	System.out.println("Test Passed!");
        else
        	System.out.println("Test Failed!");
		
		//step6:close the driver
		driver.close();
	}

}