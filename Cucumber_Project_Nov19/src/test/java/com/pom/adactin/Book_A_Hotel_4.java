package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel_4 {
	
	public WebDriver driver;
	
	public Book_A_Hotel_4(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']") //First Name
	private WebElement firstName;
	
	@FindBy(xpath ="//input[@name='last_name']") //Last Name
	private WebElement lastName;
	
	@FindBy(xpath ="//textarea[@name='address']")//Billing Address
	private WebElement billingAddress;
	
	@FindBy(xpath ="//input[@name='cc_num']") //Credit Card No
	private WebElement creditCardNo;
	
	@FindBy(xpath ="//select[@name='cc_type']") //Credit Card Type
	private WebElement creditCardType;
	
	@FindBy(xpath ="//select[@name='cc_exp_month']") //Expiry Month
	private WebElement expiryMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']") //Expirty Year
	private WebElement expiryYear;
	
	@FindBy(xpath="//input[@name='cc_cvv']") //CVV Number
	private WebElement cvvNo;
	
	@FindBy(xpath="//input[@id='book_now']") //Book Now Button
	private WebElement bookNowBtn;

	//Getters
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
}