package com.stepdef.data.pass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.Adactin_Runner_With_Data;
import com.pageobjectmanager.Page_Object_Manager_Adactin;
import com.reader.File_Reader_Manager;
import com.utilityFiles.Utility_Files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Def_Data_Parse extends Utility_Files {
	
    public static WebDriver driver = Adactin_Runner_With_Data.driver;
	
	public static Page_Object_Manager_Adactin  manage = new Page_Object_Manager_Adactin(driver);
	
	public static Logger log = Logger.getLogger(Adactin_Runner_With_Data.class); // Check this line
	
	@Given("user Launch The Adactin Application")
	public void user_launch_the_adactin_application() {
	    
		get_Url("https://adactinhotelapp.com/");
		window_Commands("maximize");
		log.info("Login Page Session Created.");
	}
	
	@When("user Enter The Username {string} In Username Field")
	public void user_enter_the_username_in_username_field(String username) {
	    send_Keys(manage.getLogin().getEmail(), username);
	}

	@When("user Enter The Password {string} In Password Field")
	public void user_enter_the_password_in_password_field(String password) {
		send_Keys(manage.getLogin().getPassword(), password);
	}

	@Then("user Click On The Login Btn, It Navigates To Adactin.com - Search Hotel")
	public void user_click_on_the_login_btn_it_navigates_to_adactin_com_search_hotel() {
	    
		click_On_Element(manage.getLogin().getLoginBtn());
		log.info("Logged in Successfully.");
	}
	
	@When("user Select {string} In Location Field")
	public void user_select_in_location_field(String location) {
	    
		select_By_Value(manage.getSearchHotel().getLocation(), location);
	}

	@When("user Select {string} In Hotels Field")
	public void user_select_in_hotels_field(String hotelName) {
		
		select_By_Visibletext(manage.getSearchHotel().getHotel(), hotelName);
	}
	
	@When("user Select {string} In Room Type Field")
	public void user_select_in_room_type_field(String roomType) {
		
		select_By_Visibletext(manage.getSearchHotel().getRoomType(), roomType);
	}
	
	@When("user Select {string} In Number of Rooms Field")
	public void user_select_in_number_of_rooms_field(String noOfRoom) {
	  
		select_By_Visibletext(manage.getSearchHotel().getNoOfRooms(), noOfRoom);
	}
	
	@When("user Enter Checkindate {string} In Check In Date Field")
	public void user_enter_checkindate_in_check_in_date_field(String checkInDate) {
		
		send_Keys(manage.getSearchHotel().getCheckInDate(), checkInDate);
	}
	
	@When("user Enter Checkoutdate {string} In Check Out Date Field")
	public void user_enter_checkoutdate_in_check_out_date_field(String checkOutDate) {
	    
		send_Keys(manage.getSearchHotel().getCheckOutDate(), checkOutDate);
	}
	
	@When("user Select Adultsperroom {string} In Adults per Room Field")
	public void user_select_adultsperroom_in_adults_per_room_field(String noOfAdult) {
	
		int noOfAdult1 = Integer.parseInt(noOfAdult); //Conveting to int bec of selectByIndex
		select_By_Index(manage.getSearchHotel().getNoOfAdult(), noOfAdult1);
	}
	
	@When("user Select Childrenperroom {string} In Children per Room Field")
	public void user_select_childrenperroom_in_children_per_room_field(String noOfChildren) {
	   
		select_By_Value(manage.getSearchHotel().getNoOfChildren(), noOfChildren);
	}
	
	@Then("user Click On The Search Btn, It Navigates To {string}")
	public void user_click_on_the_search_btn_it_navigates_to(String expected_Title) {
	   
		click_On_Element(manage.getSearchHotel().getSearchBtn());
		
		String actual_Title = driver.getTitle();
		
		Assert.assertEquals(actual_Title , expected_Title);
	}

	@When("user Click On The Radio Btn, In Select Field")
	public void user_click_on_the_radio_btn_in_select_field() {
	
		click_On_Element(manage.getSlctHotel().getRadioBtn());
	}
	
	@Then("user Click On The Continue Btn, It Navigates To {string}")
	public void user_click_on_the_continue_btn_it_navigates_to(String expected_Title) {
	    
		click_On_Element(manage.getSlctHotel().getContinuBtn());
		String actual_Title = driver.getTitle();
		Assert.assertEquals(actual_Title , expected_Title);
	}
	
	@When("user Enter The Firstname {string} In First Name Field")
	public void user_enter_the_firstname_in_first_name_field(String firstName) {
	    
		send_Keys(manage.getBookHotel().getFirstName(), firstName);
	}
	
	@When("user Enter The Lastname {string} In Last Name Field")
	public void user_enter_the_lastname_in_last_name_field(String lastName) {
		
		send_Keys(manage.getBookHotel().getLastName(), lastName);
	}
	
	@When("user Enter The Billingaddress {string} In Billing Address Field")
	public void user_enter_the_billingaddress_in_billing_address_field(String billingAddress) {
	   
		send_Keys(manage.getBookHotel().getBillingAddress(), billingAddress);
	}
	
	@When("user Enter The Creditcardno {string} In Credit Card No Field")
	public void user_enter_the_creditcardno_in_credit_card_no_field(String creditCardNo) {
	   
		send_Keys(manage.getBookHotel().getCreditCardNo(), creditCardNo);
	}
	
	@When("user Select The Creditcardtype {string} In Credit Card Type Field")
	public void user_select_the_creditcardtype_in_credit_card_type_field(String creditCardType) {
	   
		select_By_Visibletext(manage.getBookHotel().getCreditCardType(), creditCardType);
	}
	
	@When("user Select The Month {string} In Expiry Date Field")
	public void user_select_the_month_in_expiry_date_field(String expiryMonth) {
	
		select_By_Visibletext(manage.getBookHotel().getExpiryMonth(), expiryMonth);
	}
	
	@When("user Select The Year {string} In Expiry Date Field")
	public void user_select_the_year_in_expiry_date_field(String expiryYear) {
	    
		select_By_Visibletext(manage.getBookHotel().getExpiryYear(), expiryYear);
	}
	
	@When("user Enter The Cvvnumber {string} In CVV Number Field")
	public void user_enter_the_cvvnumber_in_cvv_number_field(String ccvNo) {
		
		send_Keys(manage.getBookHotel().getCvvNo(), ccvNo);
	}
	
	@Then("user Click On The Book Now Btn, It Navigates To {string}")
	public void user_click_on_the_book_now_btn_it_navigates_to(String expected_Title) {
	   
		click_On_Element(manage.getBookHotel().getBookNowBtn());
		String actual_Title = driver.getTitle();
		//System.out.println("After ccvno Actual Title:" +actual_Title);
		Assert.assertEquals(actual_Title , expected_Title);
	}
	
	@Then("user Click On Booked Itinerary Link, It Navigates To {string}")
	public void user_click_on_booked_itinerary_link_it_navigates_to(String expected_Title) throws InterruptedException, IOException {
	   
		javascript_Executor_Scroll_Or_Click("scroll", manage.getBookingConfirmation().getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", manage.getBookingConfirmation().getBookedItenaryLnk());
		sleep(3000);
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Cucumber_Project_Nov19\\Screenshot\\HotelBooking1.png");
		String actual_Title = driver.getTitle();
		//System.out.println("Actual Title Login Again:" +actual_Title);
		Assert.assertEquals(actual_Title , expected_Title); // Checking Given Page Title & Current Page Title are equal
	}

	@Then("user Click On Logout Link, It Navigates To {string}")
	public void user_click_on_logout_link_it_navigates_to(String expected_Title) {
	    
		click_On_Element(manage.getBookedItenary().getLogoutLnk());
		String actual_Title = driver.getTitle();
		//System.out.println("Actual Title:" +actual_Title);
		Assert.assertEquals(actual_Title , expected_Title); // Checking Given Page Title & Current Page Title are equal
		log.info("1st Hotel Booking Completed Successfully.");
	}

	@Then("user Click On Click here to login again Link, It Navigates To {string}")
	public void user_click_on_click_here_to_login_again_link_it_navigates_to(String expected_Title) {
		
		click_On_Element(manage.getLoginAgain().getLoginAgainLnk());
		
		String actual_Title = driver.getTitle();
		Assert.assertEquals(actual_Title , expected_Title); // Checking Given Page Title & Current Page Title are equal
	}
}