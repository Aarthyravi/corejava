package com.ecommercetestng.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceRegistrationTestNG extends BaseEcommerceTest implements EcommerceLoginDataConstant {

  @Test
  public void testWithValidData() throws InterruptedException {
	  driver.findElement(By.linkText(ACCOUNT)).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText(SIGN_UP)).click();
 	  // Set the data
	  driver.findElement(By.cssSelector(INPUT_VALUE_2)).click();
	  driver.findElement(By.id(FNAME)).sendKeys(UMA);
	  driver.findElement(By.id(LNAME)).sendKeys(RANI);
	  driver.findElement(By.id(DAY)).sendKeys(_15);
	  driver.findElement(By.id(MONTH)).sendKeys(_03);
	  driver.findElement(By.id(YEAR)).sendKeys(_1982);
	  driver.findElement(By.id(EMAIL)).sendKeys(UMA79RANI_GMAIL_COM);
	  driver.findElement(By.id(HOUSENO)).sendKeys(_8);
	  driver.findElement(By.id(ADD1)).sendKeys(HALFORD);
	  driver.findElement(By.id(CITY)).sendKeys(SANTA_BARBARA);
	  driver.findElement(By.id(STATE)).sendKeys(CA);
	  driver.findElement(By.id(COUNTRY)).sendKeys(USA);
	  driver.findElement(By.id(POSTCODE)).sendKeys(_90580);
	  driver.findElement(By.id(PHONE)).sendKeys(_405890678);
	  driver.findElement(By.id(FAX)).sendKeys(_20567890);
	  driver.findElement(By.id(PASSWORD)).sendKeys(STAR25);
	  driver.findElement(By.id(CPASSWORD)).sendKeys(STAR25);
	  driver.findElement(By.id(TERMS)).click();
	  driver.findElement(By.name(SUBMIT)).click();
	  Thread.sleep(1000);
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url,THANKYOUMESSAGE_PHP_MSG_REG);
  }
  
  @Test
  public void testWithInValidEmail() throws InterruptedException {
	  driver.findElement(By.linkText(ACCOUNT)).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText(SIGN_UP)).click();
  
	  // Set the data
	  driver.findElement(By.cssSelector(INPUT_VALUE_2)).click();
	  driver.findElement(By.id(FNAME)).sendKeys(PADMA);
	  driver.findElement(By.id(LNAME)).sendKeys(CHOLLA);
	  driver.findElement(By.id(DAY)).sendKeys(_15);
	  driver.findElement(By.id(MONTH)).sendKeys(_03);
	  driver.findElement(By.id(YEAR)).sendKeys(_1982);
	  driver.findElement(By.id(EMAIL)).sendKeys(EMPTY_EMAIL);
	   driver.findElement(By.id(TERMS)).click();
	  driver.findElement(By.name(SUBMIT)).click();
	  Thread.sleep(3000);
	  String actualmsg = driver.findElement(By.xpath(SPAN_CLASS_MSG2)).getText();
	  Assert.assertEquals(actualmsg,EMAIL_ADDRESS_IS_ALREADY_REGISTERED);
			
  }
  @Test
  public void testWithInValidTerms() throws InterruptedException {
	  driver.findElement(By.linkText(ACCOUNT)).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText(SIGN_UP)).click();
  
	  // Set the data
	  driver.findElement(By.cssSelector(INPUT_VALUE_2)).click();
	  driver.findElement(By.id(FNAME)).sendKeys(PADMA);
	  driver.findElement(By.id(LNAME)).sendKeys(CHOLLA);
	  driver.findElement(By.id(DAY)).sendKeys(_15);
	  driver.findElement(By.id(MONTH)).sendKeys(_03);
	  driver.findElement(By.id(YEAR)).sendKeys(_1982);
	  driver.findElement(By.id(EMAIL)).sendKeys(EMPTY_EMAIL);
	  driver.findElement(By.id(HOUSENO)).sendKeys(_8);
	  driver.findElement(By.name(SUBMIT)).click();
	  Thread.sleep(1000);
	  String actualmsg = driver.findElement(By.xpath(SPAN_CLASS_MSG2)).getText();
	  Assert.assertEquals(actualmsg,YOU_MUST_AGREE_TO_THE_TERMS_AND_CONDITIONS);
  }
  
}