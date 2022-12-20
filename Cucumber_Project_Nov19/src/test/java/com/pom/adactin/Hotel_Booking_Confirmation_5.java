package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Booking_Confirmation_5 {

	public WebDriver driver;
	
	public Hotel_Booking_Confirmation_5(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='Booked Itinerary']") //Booked Itenary Link
	private WebElement bookedItenaryLnk;

	//Getters
	public WebElement getBookedItenaryLnk() {
		return bookedItenaryLnk;
	}
}