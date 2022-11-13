package com.stepdefinition;

import com.utilites.Common_Utilites;
import com.webdriver_manager.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {
		try {

			Common_Utilites commonutil = new Common_Utilites();
			commonutil.loadProperties();
			DriverManager.launchBrowser(); // Launching the browser
			commonutil.initWebElements(); // Elements
		} catch (Exception e) {

			System.out.println(e);
		}
	}

	@After

	public void afterScenario() {
		DriverManager.closeBrowser(); // close the browser*/

	}

}
