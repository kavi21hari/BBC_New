package com.webdriver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.constant.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
private static WebDriver driver=null;

	public static void launchBrowser() {
		try {
			
			switch (Constant.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				break;
				
			case "ie":
				WebDriverManager.iedriver().setup();
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
                break;
                
			default :
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
		public static void closeBrowser() {
			driver.close();
			
		

		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	
}
