package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itenary_Slct_Hotel_6 {

	public WebDriver driver;
	
	public Booked_Itenary_Slct_Hotel_6(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[.='Logout']") //Logout Link
	private WebElement logoutLnk;

	//Getters
	public WebElement getLogoutLnk() {
		return logoutLnk;
	}
}