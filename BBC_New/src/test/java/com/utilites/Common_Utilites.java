package com.utilites;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import com.constant.Constant;
import com.page_object.BBC_SoundsPage;
import com.webdriver_manager.DriverManager;

public class Common_Utilites {
	
	
	// Config file loader
	 public void loadProperties() {
			
			Properties properties =new Properties();
			try {
				properties.load(getClass().getResourceAsStream("/config.properties"));
			} catch (Exception e) {
				System.out.println(e);
			}
			
			Constant.APP_URL=properties.getProperty("APP_URL");
			Constant.BROWSER=properties.getProperty("BROWSER");
			Constant.PAGETITLE=properties.getProperty("PAGETITLE");
			Constant.SOUNDPAGETITLE=properties.getProperty("SOUNDPAGETITLE");
			Constant.CATEGORYPAGETITLE=properties.getProperty("CATEGORYPAGETITLE");
			
		}

			public void initWebElements() {
		    PageFactory.initElements(DriverManager.getDriver(),BBC_SoundsPage.getInstance());
		   
				
			}
				
			

}
