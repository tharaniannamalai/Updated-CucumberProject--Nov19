package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_2 {

	public WebDriver driver;
	
	public Search_Hotel_2(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//select[@name='location']") //Location
	private WebElement location;
	
	@FindBy(xpath ="//select[@name='hotels']") //Hotel
	private WebElement hotel;
	
	@FindBy(xpath ="//select[@name='room_type']") //Room Type
	private WebElement roomType;
	
	@FindBy(xpath ="//select[@name='room_nos']") //No of Rooms
	private WebElement noOfRooms;
	
	@FindBy(xpath ="//input[@name='datepick_in']") //Check In Date
	private WebElement checkInDate;
	
	@FindBy(xpath ="//input[@name='datepick_out']") //Check Out Date
	private WebElement checkOutDate;
	
	@FindBy(xpath ="//select[@id='adult_room']") //Adults per Room
	private WebElement noOfAdult;
	
	@FindBy(xpath ="//select[@id='child_room']") //Children per Room
	private WebElement noOfChildren;
	
	@FindBy(xpath ="//input[@id='Submit']") //Search Button
	private WebElement searchBtn;

	//Getters
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getNoOfAdult() {
		return noOfAdult;
	}

	public WebElement getNoOfChildren() {
		return noOfChildren;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
}