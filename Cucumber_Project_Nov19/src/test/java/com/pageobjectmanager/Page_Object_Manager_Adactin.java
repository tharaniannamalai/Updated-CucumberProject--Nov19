package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Book_A_Hotel_4;
import com.pom.adactin.Booked_Itenary_Slct_Hotel_6;
import com.pom.adactin.Hotel_Booking_Confirmation_5;
import com.pom.adactin.Login_Page_1;
import com.pom.adactin.Logout_Page_7;
import com.pom.adactin.Search_Hotel_2;
import com.pom.adactin.Slct_Hotel_3;

public class Page_Object_Manager_Adactin {
	
public WebDriver driver;
	
	private Login_Page_1 login;
	
	private Search_Hotel_2 searchHotel;
	
	private Slct_Hotel_3 slctHotel;
	
	private Book_A_Hotel_4 bookHotel;
	
	private Hotel_Booking_Confirmation_5 bookingConfirmation;
	
	private Booked_Itenary_Slct_Hotel_6 bookedItenary;
	
	private Logout_Page_7 loginAgain;
	
	public Page_Object_Manager_Adactin(WebDriver driver)
	{
		this.driver = driver;
	}

	public Login_Page_1 getLogin() {
		
		if(login == null)
		{
			login = new Login_Page_1(driver);
		}
		
		return login;
	}

	public Search_Hotel_2 getSearchHotel() {
		
		if(searchHotel == null)
		{
			searchHotel = new Search_Hotel_2(driver);
		}
		
		return searchHotel;
	}

	public Slct_Hotel_3 getSlctHotel() {
		
		if(slctHotel == null)
		{
			slctHotel = new Slct_Hotel_3(driver);
		}
		
		return slctHotel;
	}

	public Book_A_Hotel_4 getBookHotel() {
		
		if(bookHotel == null)
		{
			bookHotel = new Book_A_Hotel_4(driver);
		}
		
		return bookHotel;
	}

	public Hotel_Booking_Confirmation_5 getBookingConfirmation() {
		
		if(bookingConfirmation == null)
		{
			bookingConfirmation = new Hotel_Booking_Confirmation_5(driver);
		}
		
		return bookingConfirmation;
	}

	public Booked_Itenary_Slct_Hotel_6 getBookedItenary() {
		
		if(bookedItenary == null)
		{
			bookedItenary = new Booked_Itenary_Slct_Hotel_6(driver);
		}
		
		return bookedItenary;
	}

	public Logout_Page_7 getLoginAgain() {
		
		if(loginAgain == null)
		{
			loginAgain = new Logout_Page_7(driver);
		}
		return loginAgain;
	}

}
