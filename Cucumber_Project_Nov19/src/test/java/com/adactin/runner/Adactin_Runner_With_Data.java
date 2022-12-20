package com.adactin.runner;

import org.apache.log4j.BasicConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utilityFiles.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	  
		features = ".//FeatureFiles//AdactinWithData.feature",
		
		glue = "com.stepdef.data.pass",
		
		monochrome = true,
		
		dryRun = false,
		
		publish = true,
		
		plugin = {"html:TestReport/report.html", "json:TestReport/jsReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		
		tags = "@AdactinAccess or @AdactinHotelBooking"
		
		)

		
public class Adactin_Runner_With_Data {
	
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
