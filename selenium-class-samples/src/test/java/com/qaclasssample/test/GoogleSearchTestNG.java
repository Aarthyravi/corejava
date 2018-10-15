package com.qaclasssample.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleSearchTestNG extends BaseGoogleSearchTest implements GoogleTestDataConstant{
			
 @Test
  public void testWithCorrectData() {
	  driver.findElement(By.id(TEXT_BOX_ID_CONSTANT)).sendKeys(TEST_DATA_CONSTANT);
	  driver.findElement(By.name(BUTTON_CONSTANT)).click();
  }
 
} 