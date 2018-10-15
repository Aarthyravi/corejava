package com.apex.ecommerce.login.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.login.constant.LoginPageConstant;

public class LoginPage {
	@FindBy(id=LoginPageConstant.EMAIL_ID_LOCATOR)
	WebElement emailElem;
	@FindBy(id=LoginPageConstant.PASSWORD_LOCATOR)
	WebElement passwordElem;
	@FindBy(linkText=LoginPageConstant.LINKTEXT_LOCATOR)
	WebElement loginElem;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void signOn(String emailID, String password) {
		emailElem.sendKeys(emailID);
		passwordElem.sendKeys(password);
		loginElem.click();
	}

}
