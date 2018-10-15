package com.ecommercetestng.test;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.DataProvider;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;


public class EcommerceLoginTestNGDataProvider extends BaseEcommerceTest {

  @DataProvider(name="invaliddata")
  public static Object[][] invaliddata() {
      /*return new Object[][] {{"benu@gmail.com", "star25"}, 
    	  {"pa@gmail.com", "s25"}, {"", "star25"}, {"benu@gmail.com", ""}, 
    	  {"", ""}, {"benu@gmail.com", "s25"}};*/
	  String[][] testInvalidData = getTableArray("login_datas.xls","Sheet1","invalid_datas");
	  return testInvalidData;
   }
  
  @Test
  public void testWithValidData() throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys("uma11@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("star25");
	  // perform action
	  driver.findElement(By.linkText("Login")).click();
	  Thread.sleep(1000);
	  String actualloginmsg = driver.findElement(By.xpath("//div[@class='fntstyle']")).getText();
	  Assert.assertEquals(actualloginmsg,"You have Logged In successfully.");
  }
  
  @Test(dataProvider ="invaliddata")
  public void testWithInValidUsernamePassword(String username, String password) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  // perform action
	  driver.findElement(By.linkText("Login")).click();
	  Thread.sleep(1000);
	  String actualerrormsg = driver.findElement(By.xpath("//span[@class='msg']")).getText();
	  Assert.assertEquals(actualerrormsg,"Invalid Username / Password!");
  }
  
  public static String[][] getTableArray(String xlFilePath, String sheetName, String tableName){
      String[][] tabArray=null;
      try{
          Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
          Sheet sheet = workbook.getSheet(sheetName);
          int startRow,startCol, endRow, endCol,ci,cj;
          Cell tableStart=sheet.findCell(tableName);
          startRow=tableStart.getRow();
          startCol=tableStart.getColumn();

          Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                               

          endRow=tableEnd.getRow();
          endCol=tableEnd.getColumn();
          System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                  "startCol="+startCol+", endCol="+endCol);
          tabArray=new String[endRow-startRow-1][endCol-startCol-1];
          ci=0;

          for (int i=startRow+1;i<endRow;i++,ci++){
              cj=0;
              for (int j=startCol+1;j<endCol;j++,cj++){
                  tabArray[ci][cj]=sheet.getCell(j,i).getContents();
              }
          }
      }
      catch (Exception e)    {
          System.out.println("error in getTableArray()");
      }

      return(tabArray);
  }
  
  
}