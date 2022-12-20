package com.hooks;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Adactin_Runner_With_Data_Hks;
import com.pageobjectmanager.Page_Object_Manager_Adactin;
import com.utilityFiles.Utility_Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Adactin_Hooks extends Utility_Files {
	

	public static WebDriver driver = Adactin_Runner_With_Data_Hks.driver;
	
	public static Page_Object_Manager_Adactin  manage = new Page_Object_Manager_Adactin(driver);
	
	@Before(order=1)
	public void launchUrl()
	{
		get_Url("https://adactinhotelapp.com/");
	}
	
	@Before(order=2)
	public void maxi()
	{
		window_Commands("maximize");
	}
	
	@After(order=2)
	public void logout()
	{
		click_On_Element(manage.getBookedItenary().getLogoutLnk());
	}

	@After(order=1)
	public void loginAgain()
	{
		click_On_Element(manage.getLoginAgain().getLoginAgainLnk());
	}
	
	
}
