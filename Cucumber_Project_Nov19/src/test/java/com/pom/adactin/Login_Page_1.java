package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_1 {

public WebDriver driver;
	
	public Login_Page_1(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='username']") //UserName
	private WebElement email;
	
	@FindBy(xpath ="//input[@id='password']") //Password
	private WebElement password;
	
	@FindBy(xpath ="//input[@id='login']") //Login Button
	private WebElement loginBtn;

	//Getters
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
