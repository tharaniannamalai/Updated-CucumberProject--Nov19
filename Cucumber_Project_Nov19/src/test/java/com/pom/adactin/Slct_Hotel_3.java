package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slct_Hotel_3 {

	public WebDriver driver;
	
	public Slct_Hotel_3(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='radiobutton_0']") //Radio Button
	private WebElement radioBtn;
	
	@FindBy(xpath ="//input[@id='continue']") //Continue Button
	private WebElement continuBtn;

	//Getters
	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinuBtn() {
		return continuBtn;
	}
}