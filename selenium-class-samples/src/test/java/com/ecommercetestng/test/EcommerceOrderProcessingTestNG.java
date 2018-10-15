package com.ecommercetestng.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;

public class EcommerceOrderProcessingTestNG extends BaseOrderProcessingTest implements OrderProcessingDataConstant {
	
  @Test
  public void testWithProductPage() throws InterruptedException {
	  // Check Electronics sub menu Categories, it redirects to category.php page
	  driver.get(HTTP_ECOMMERCE_SAIPRATAP_NET_PRODUCTS_PHP);
	  driver.findElement(By.linkText(ELECTRONICS)).click();
	  driver.findElement(By.linkText(COMPUTERS)).click();
	  Thread.sleep(2000);
	  String expected = CATEGORY_PHP_INTCATID_7;
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(2000);
  }
  
  @Test
  public void testWithProductPageDetails() throws InterruptedException {
	  // Check ViewItem button, it redirects to prodetail.php page 
	  driver.get(PRODUCTS_PHP_SORT_LTOH);
	  driver.findElement(By.cssSelector(A_HREF_PRODDETAIL_PHP_PROID_10005)).click();
	  String expected = PRODDETAIL_PHP_PROID_10005;
	  Thread.sleep(1000);
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(1000);
  }
  @Test
  public void testWithProductPageDetailsAddCart() throws InterruptedException {
	  // Check Add to Cart button, it redirects to cart.php page
	  driver.get(PRODDETAIL_PHP_PROID_10005);
	  driver.findElement(By.cssSelector(INPUT_TYPE_IMAGE)).click();
	  Thread.sleep(1000);
	  String expected = CART_PHP_PROID_10005;
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
      Thread.sleep(1000);
      // Check Continue button, again it redirects to products.php page
      driver.get(PRODDETAIL_PHP_PROID_10005);
      driver.findElement(By.cssSelector(IMG_SRC_IMAGES_CONTINUE_GIF)).click();
      Thread.sleep(1000);
      String expected1 = HTTP_ECOMMERCE_SAIPRATAP_NET_PRODUCTS_PHP;
      String actualUrl1 = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl1, expected1);
      Thread.sleep(1000);
   }
  @Test
  public void testWithProductPageDetailsCheckout() throws InterruptedException {
	  driver.get(PRODDETAIL_PHP_PROID_10005);
	  driver.findElement(By.cssSelector(INPUT_TYPE_IMAGE)).click();
	  // Check Checkout button, it redirects to login page
	  driver.get(CART_PHP_PROID_10005);
	  driver.findElement(By.cssSelector(A_CLASS_CONTINUE)).click();
	  String expected = CUSTOMERLOGIN_PHP_A_6;
	  Thread.sleep(1000);
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(1000);
  }  
  
  @Test
  public void testWithProductPageDetailsLogin() throws InterruptedException {
	  driver.get(CUSTOMERLOGIN_PHP_A_6);
	  driver.findElement(By.id(EMAIL)).sendKeys(UMA_GMAIL_COM);
	  driver.findElement(By.id(PASSWORD)).sendKeys(STAR25);
	  //step4: perform and action
	  driver.findElement(By.linkText(LOGIN)).click();
	  Thread.sleep(2000);
	  String expected = CHECKPERSONALDETAIL_PHP;
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(1000);
  }
  @Test
  public void testWithProductPageDetailsLoginP() throws InterruptedException {
	  driver.get(CHECKPERSONALDETAIL_PHP);
	  driver.findElement(By.cssSelector(A_HREF_CHECKOUTSHIPING_PHP)).click();
	  Thread.sleep(2000);
	  String expected = CHECKOUTSHIPING_PHP;
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(1000);
  }
  @Test
  public void testWithProductPageDetailsLoginPCheckout() throws InterruptedException {
	  driver.get(CHECKOUTSHIPING_PHP);
	  driver.findElement(By.cssSelector(INPUT_VALUE_2)).click();
	  Thread.sleep(2000);
	  //click on continue button on 'postage' menu bar 
	  driver.findElement(By.cssSelector(IMG_SRC_IMAGES_CONTINUE_GIF)).click();
	  Thread.sleep(2000);
	  String expected = CHECKOUTPAYMENT_PHP_SHIP_2;
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(2000);
  }
  @Test
  public void testWithProductPageDetailsLoginPCheckout2() throws InterruptedException {
	  driver.get(CHECKOUTPAYMENT_PHP_SHIP_2);
	  //click on continue button on 'Pay' code menu bar		
	  driver.findElement(By.cssSelector(IMG_SRC_IMAGES_CONTINUE_GIF)).click();
	  Thread.sleep(2000);
	  String expected = CHECKFIDETAIL_PHP_SHIP_2;
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(2000);
  }
  @Test
  public void testWithProductPageDetailsLoginPCheckout3() throws InterruptedException {
	  driver.get(CHECKFIDETAIL_PHP_SHIP_2);
	  //click on continue button on 'Discount codes' menu bar
	  driver.findElement(By.cssSelector(IMG_SRC_IMAGES_CONTINUE_GIF)).click();
	  Thread.sleep(2000);
	  String actualUrl = driver.getCurrentUrl();
	  String expected = CHECKFINALREVIEW_PHP_SHIP_2;
	  Assert.assertEquals(actualUrl, expected);
	  Thread.sleep(2000);
  }

}
