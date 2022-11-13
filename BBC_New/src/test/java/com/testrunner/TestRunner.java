package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:/features",
		glue="com.stepdefinition", dryRun = false , monochrome = true,
				plugin = {"pretty","html:target\\Report.html","json:target\\Report.json",
				"junit:target\\Report.junit","rerun:target\\Rerun.txt"}
		)
public class TestRunner {
	

}
