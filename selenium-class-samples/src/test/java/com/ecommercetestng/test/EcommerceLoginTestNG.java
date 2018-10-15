package com.ecommercetestng.test;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EcommerceLoginTestNG extends BaseEcommerceTest implements EcommerceLoginDataConstant {
    
  @Test(priority=8)
  public void testWithCorrectData() throws InterruptedException {
	  driver.get(baseUrl);
	  WebElement email = driver.findElement(By.id(EMAIL_CONSTANT));
	  email.sendKeys(UMA79RANI_GMAIL_COM);
	  WebElement password = driver.findElement(By.id(PASSWORD_CONSTANT));
	  password.sendKeys(STAR25);
	  // perform and action
	  WebElement login = driver.findElement(By.linkText(LOGIN_BUTTON_CONSTANT));
	  login.click();
	  Thread.sleep(2000);
	  String actual = driver.getCurrentUrl();
	  System.out.println(actual);
	  String actualloginmsg = driver.findElement(By.xpath(DIV_CLASS_FNTSTYLE)).getText();
	  Assert.assertEquals(actualloginmsg,YOU_HAVE_LOGGED_IN_SUCCESSFULLY);
  }
  @Test(priority=5)
  public void testWithInCorrectUsername() throws InterruptedException {
	  driver.findElement(By.id(EMAIL_CONSTANT)).sendKeys(BENU_GMAIL_COM);
	  driver.findElement(By.id(PASSWORD_CONSTANT)).sendKeys(STAR25_TESTDATA);
	  // perform and action
	  driver.findElement(By.linkText(LOGIN_BUTTON_CONSTANT)).click();
	  Thread.sleep(3000);
	  String actualerrormsg = driver.findElement(By.xpath(SPAN_CLASS_MSG)).getText();
	  Assert.assertEquals(actualerrormsg,INVALID_USERNAME_PASSWORD);
  }
  @Test(priority=6)
  public void testWithInCorrectPassword() throws InterruptedException {
	  driver.findElement(By.id(EMAIL_CONSTANT)).sendKeys(UMA79RANI_GMAIL_COM);
	  driver.findElement(By.id(PASSWORD_CONSTANT)).sendKeys(S25);
	  // perform and action
	  driver.findElement(By.linkText(LOGIN_BUTTON_CONSTANT)).click();
	  Thread.sleep(3000);
	  String actualerrormsg = driver.findElement(By.xpath(SPAN_CLASS_MSG)).getText();
	  Assert.assertEquals(actualerrormsg,INVALID_USERNAME_PASSWORD);
  }
  @Test(priority=1)
  public void testWithBlankUsername() throws InterruptedException {
	  driver.findElement(By.id(EMAIL_CONSTANT)).sendKeys(EMPTYCONSTANT);
	  driver.findElement(By.id(PASSWORD_CONSTANT)).sendKeys(STAR25_TESTDATA);
	  // perform and action
	  driver.findElement(By.linkText(LOGIN_BUTTON_CONSTANT)).click();
	  Thread.sleep(3000);
	  String actualerrormsg = driver.findElement(By.xpath(SPAN_CLASS_MSG)).getText();
	  Assert.assertEquals(actualerrormsg,INVALID_USERNAME_PASSWORD);
  }
  @Test(priority=2)
  public void testWithBlankPassword() throws InterruptedException {
	  driver.findElement(By.id(EMAIL_CONSTANT)).sendKeys(BENU_GMAIL_COM);
	  driver.findElement(By.id(PASSWORD_CONSTANT)).sendKeys(EMPTYCONSTANT);
	  // perform and action
	  driver.findElement(By.linkText(LOGIN_BUTTON_CONSTANT)).click();
	  Thread.sleep(3000);
	  String actualerrormsg = driver.findElement(By.xpath(SPAN_CLASS_MSG)).getText();
	  Assert.assertEquals(actualerrormsg,INVALID_USERNAME_PASSWORD);
  }
  @Test(priority=7)
  public void testWithInCorrectUsernamePassword() throws InterruptedException {
	  driver.findElement(By.id(EMAIL_CONSTANT)).sendKeys(BENU_GMAIL_COM);
	  driver.findElement(By.id(PASSWORD_CONSTANT)).sendKeys(S25);
	  // perform and action
	  driver.findElement(By.linkText(LOGIN_BUTTON_CONSTANT)).click();
	  Thread.sleep(3000);
	  String actualerrormsg = driver.findElement(By.xpath(SPAN_CLASS_MSG)).getText();
	  Assert.assertEquals(actualerrormsg,INVALID_USERNAME_PASSWORD);
  }
  @Test(priority=3)
  public void testWithBlankUsernamePassword() throws InterruptedException {
	  Thread.sleep(1000);
	  driver.findElement(By.id(EMAIL_CONSTANT)).sendKeys(EMPTYCONSTANT);
	  driver.findElement(By.id(PASSWORD_CONSTANT)).sendKeys(EMPTYCONSTANT);
	  // perform and action
	  driver.findElement(By.linkText(LOGIN_BUTTON_CONSTANT)).click();
	  Thread.sleep(3000);
	  String actualerrormsg = driver.findElement(By.xpath(SPAN_CLASS_MSG)).getText();
	  Assert.assertEquals(actualerrormsg,INVALID_USERNAME_PASSWORD);
  }
  @Test(priority=7)
  public void testWithInForgotPassword() throws InterruptedException {
	  driver.findElement(By.cssSelector(FORGOTPASSWORD_PHP)).click();
	  driver.findElement(By.id(MAIL_ADDRESS)).sendKeys(PA_GMAIL_COM);
	  driver.findElement(By.name(SUBMIT)).click();
	  Thread.sleep(2000);
	  String actualUrl = driver.getCurrentUrl();
	  String expected = "http://ecommerce.saipratap.net/thankyoumessage.php?msg=forgotpass";
	  Assert.assertEquals(actualUrl, expected);
  }
  @Test(priority=9)
  public void testWithInForgotPasswordBlankEmail() throws InterruptedException {
	  driver.get(baseUrl);
	  WebElement forgotpass = driver.findElement(By.cssSelector(FORGOTPASSWORD_PHP));
	  forgotpass.click();
	  WebElement mailaddress = driver.findElement(By.id(MAIL_ADDRESS));
	  mailaddress.sendKeys("");
	  WebElement submit = driver.findElement(By.name(SUBMIT));
	  submit.click();
	  Thread.sleep(2000);
	  // Switching to Alert        
      Alert alert = driver.switchTo().alert();		
      // Capturing alert message.    
      String alertMessage= driver.switchTo().alert().getText();		
      // Displaying alert message		
      System.out.println(alertMessage);	
      Thread.sleep(1000);
      // Accepting alert		
      alert.accept();	
  }
}