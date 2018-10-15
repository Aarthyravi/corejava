package com.qaclasssample.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Googlesearchtest_DP extends BaseGoogleSearchTest implements GoogleTestDataConstant {
// define the data xls(spreadsheet), read from it and pass to the test
// repeated test --> use Data Provider
// Step1: Define the data provider
// Step2: pass the data provider information to test
// Step3: update the data provider code to read from spreadsheet
  
  @DataProvider(name = "search_data")
  public Object[][] getdata(){
	  //String[][] myData = {{"Java Book"},{"Sony Tv"}};
	  String[][] myData = getTableArray("google_search.xls","Sheet1","search_text");
	  return myData;
  }
	
  @Test(dataProvider = "search_data")
  public void testSearch(String searchText) {
	  //Step3: Set the data
	  WebElement searchboxelem = driver.findElement(By.id(TEXT_BOX_ID_CONSTANT));
	  searchboxelem.sendKeys(searchText);
	  // Step4: Perform action
	  WebElement searchbtn = driver.findElement(By.name(BUTTON_CONSTANT));
	  searchbtn.click();
	  // Step5: Validate 
	  //Assert.assertEquals(driver.getTitle(), JAVA_BOOK_GOOGLE_SEARCH);
  }
  public String[][] getTableArray(String xlFilePath, String sheetName, String tableName){
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
