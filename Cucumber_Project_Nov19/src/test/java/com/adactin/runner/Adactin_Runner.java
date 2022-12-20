package com.adactin.runner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.Page_Object_Manager_Adactin;
import com.utilityFiles.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	  
		features = ".//FeatureFiles//Adactin.feature",
		
		glue = "com.stepdef",
		
		monochrome = true,
		
		dryRun = false,
		
		publish = false,
		
		plugin = {"html:TestReport/report.html", "json:TestReport/jsReport.json"}
		)

public class Adactin_Runner {

	public static WebDriver driver;
	
	//public static Page_Object_Manager_Adactin  manage = new Page_Object_Manager_Adactin(driver);
	
	@BeforeClass
	public static void setUp()
	{
		driver = Utility_Files.browser_Config("chrome");
		
		BasicConfigurator.configure();
		
		Utility_Files.implicit_Wait("seconds", 900);
	}
	
	@AfterClass
	public static void tearDown()
	{
		driver.close();
	}
}
