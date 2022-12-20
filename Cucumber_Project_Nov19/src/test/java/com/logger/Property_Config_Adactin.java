package com.logger;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.Page_Object_Manager_Adactin;
import com.utilityFiles.Utility_Files;

public class Property_Config_Adactin extends Utility_Files{
	
	public static Logger log = Logger.getLogger(Property_Config_Adactin.class);
	
	public static WebDriver driver = browser_Config("chrome");
    
    public static Page_Object_Manager_Adactin  manage = new Page_Object_Manager_Adactin(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		window_Commands("maximize");
		
		get_Url("https://adactinhotelapp.com/");
		
		implicit_Wait("seconds", 900);
	
		//-------------1st Hotel Booking Details------------------------------------------------------------------------------------------
		
		//Login Page
		
		log.info("Login Page Session Created.");

		send_Keys(manage.getLogin().getEmail(),"TharaniA");

		send_Keys(manage.getLogin().getPassword(), "Abc1234");
		
		click_On_Element(manage.getLogin().getLoginBtn());
		
		log.info("Logged in Successfully.");
		
		//Search Hotel Page 
		
		log.info("1st Hotel Booking Session Created.");
		
		select_By_Value(manage.getSearchHotel().getLocation(), "New York");
		
		select_By_Visibletext(manage.getSearchHotel().getHotel(), "Hotel Sunshine");
		
		select_By_Visibletext(manage.getSearchHotel().getRoomType(), "Super Deluxe");
		
		select_By_Visibletext(manage.getSearchHotel().getNoOfRooms(), "2 - Two");
		
		send_Keys(manage.getSearchHotel().getCheckInDate(), "18/11/2022");
	
		send_Keys(manage.getSearchHotel().getCheckOutDate(), "19/11/2022");
		
		select_By_Index(manage.getSearchHotel().getNoOfAdult(), 2);
		
		select_By_Value(manage.getSearchHotel().getNoOfChildren(), "1");
		
		click_On_Element(manage.getSearchHotel().getSearchBtn());
		
		//Select Hotel Page
	
		click_On_Element(manage.getSlctHotel().getRadioBtn());
		
		click_On_Element(manage.getSlctHotel().getContinuBtn());
		
		
		//Book A Hotel Page - Personal & Card Details 
		
		send_Keys(manage.getBookHotel().getFirstName(), "Srihari");
	
		send_Keys(manage.getBookHotel().getLastName(), "S");
		
		send_Keys(manage.getBookHotel().getBillingAddress(), "FlameView Place");
		
		send_Keys(manage.getBookHotel().getCreditCardNo(), "4899309123539920");

		select_By_Visibletext(manage.getBookHotel().getCreditCardType(), "Master Card");
		
		select_By_Visibletext(manage.getBookHotel().getExpiryMonth(), "December");
		
		select_By_Visibletext(manage.getBookHotel().getExpiryYear(), "2022");
		
		send_Keys(manage.getBookHotel().getCvvNo(), "978");
		
		click_On_Element(manage.getBookHotel().getBookNowBtn());
		
		
		//Hotel Booking Confirmation Page - Booked Itenary 
		
		javascript_Executor_Scroll_Or_Click("scroll", manage.getBookingConfirmation().getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", manage.getBookingConfirmation().getBookedItenaryLnk());
		
		sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation1.png");
		
		//Booked Itenary - Select Hotel Page - Logout Button
		
		click_On_Element(manage.getBookedItenary().getLogoutLnk());
		
		log.info("1st Hotel Booking Completed Successfully.");
		
		//Logout Page - Login Again
		
		click_On_Element(manage.getLoginAgain().getLoginAgainLnk());
		
		
		//-------------2nd Hotel Booking Details------------------------------------------------------------------------------------------
		
		//Login Page
		
		log.info("Again Login Page Session Created.");
		
		send_Keys(manage.getLogin().getEmail(), "TharaniA");
		
		send_Keys(manage.getLogin().getPassword(), "Abc1234");
		
		click_On_Element(manage.getLogin().getLoginBtn());
		
		log.info("Logged in Successfully.");
		
		//Search Hotel Page
		
		log.info("2nd Hotel Booking Session Created.");
		
		select_By_Visibletext(manage.getSearchHotel().getLocation(), "Los Angeles");
		
		select_By_Visibletext(manage.getSearchHotel().getHotel(), "Hotel Cornice");
		
		select_By_Visibletext(manage.getSearchHotel().getRoomType(), "Super Deluxe");
		
		select_By_Visibletext(manage.getSearchHotel().getNoOfRooms(), "1 - One");
		
		send_Keys(manage.getSearchHotel().getCheckInDate(), "21/11/2022");
		
		send_Keys(manage.getSearchHotel().getCheckOutDate(), "24/11/2022");
		
		select_By_Visibletext(manage.getSearchHotel().getNoOfAdult(), "2 - Two");
		
		select_By_Value(manage.getSearchHotel().getNoOfChildren(), "1");
		
		click_On_Element(manage.getSearchHotel().getSearchBtn());
		
		
		//Select Hotel Page

		click_On_Element(manage.getSlctHotel().getRadioBtn());
		
		click_On_Element(manage.getSlctHotel().getContinuBtn());

		
		//Book A Hotel PagePersonal & Card Details
		
		send_Keys(manage.getBookHotel().getFirstName(), "Santosh");
		
		send_Keys(manage.getBookHotel().getLastName(), "Kumar");
		
		send_Keys(manage.getBookHotel().getBillingAddress(), "Alphen Mews");
		
		send_Keys(manage.getBookHotel().getCreditCardNo(), "4899309123539920");
		
		select_By_Visibletext(manage.getBookHotel().getCreditCardType(), "Master Card");
		
		select_By_Visibletext(manage.getBookHotel().getExpiryMonth(), "December");
		
		select_By_Visibletext(manage.getBookHotel().getExpiryYear(), "2022");
	
		send_Keys(manage.getBookHotel().getCvvNo(), "256");
		
		click_On_Element(manage.getBookHotel().getBookNowBtn());
		
		
		//Hotel Booking Confirmation Page - Booked Itenary
		
		javascript_Executor_Scroll_Or_Click("scroll", manage.getBookingConfirmation().getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", manage.getBookingConfirmation().getBookedItenaryLnk());
	
		sleep(2000);
		
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Screenshot\\BaseStaItenaryHotelBookingConfirmation2.png");
		
		log.info("2nd Hotel Booking Completed Successfully.");
		
		//Booked Itenary - Select Hotel Page - Logout Button
		click_On_Element(manage.getBookedItenary().getLogoutLnk());
		
		log.info("Logged out from the account.");
	}

}
