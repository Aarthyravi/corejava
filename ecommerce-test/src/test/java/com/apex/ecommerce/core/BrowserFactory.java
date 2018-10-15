package com.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
		if(browserName.equals("ff")){
			driver = new FirefoxDriver();
		}else if(browserName.equals("chrome")){
			System.setProperty("chrome driver", "c:\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("ie")){
			System.setProperty("IED driver", "c:\\drivers\\IEDriver.exe");
			driver = new InternetExplorerDriver();
		}	
		return driver;	
	}
}
