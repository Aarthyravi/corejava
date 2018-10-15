package com.apex.ecommerce.login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.BaseTest;
import com.apex.ecommerce.core.JXLUtil;
import com.apex.ecommerce.login.constant.LoginPageConstant;
import com.apex.ecommerce.login.page.LoginPage;

public class LoginPageTest extends BaseTest implements LoginPageConstant {
	
	@DataProvider(name="invaliddata")
	public Object[][] getSignOnInvalidData(){
		return JXLUtil.getTableArray("login_datas", "Sheet1", "invalid_datas");
	}
	@Test
	public void testLoginPageSuccess() throws InterruptedException {
		//Step1: Create the page
		LoginPage loginpage = new LoginPage(driver);
		//Step2: Perform & action
		loginpage.signOn("uma11@gmail.com", "star25");
		//step3: assert
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		String actualloginmsg = driver.findElement(By.xpath("//div[@class='fntstyle']")).getText();
		Assert.assertEquals(actualloginmsg,"You have Logged In successfully.");
	}
	
	@Test(dataProvider="invaliddata")
	public void testLoginPageFail(String username, String password) throws InterruptedException {
		//Step1: Create the page
		LoginPage loginpage = new LoginPage(driver);
		//Step2: Perform & action
		loginpage.signOn(username, password);
		//step3: assert
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		String actualerrormsg = driver.findElement(By.xpath("//span[@class='msg']")).getText();
		Assert.assertEquals(actualerrormsg,"Invalid Username / Password!");
	}
}
