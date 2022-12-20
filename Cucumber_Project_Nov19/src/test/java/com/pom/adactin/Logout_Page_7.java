package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page_7 {

	public WebDriver driver;
	
	public Logout_Page_7(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(.,'login again')]") //Login Again Link
	private WebElement loginAgainLnk;

	//Getters
	public WebElement getLoginAgainLnk() {
		return loginAgainLnk;
	}
}