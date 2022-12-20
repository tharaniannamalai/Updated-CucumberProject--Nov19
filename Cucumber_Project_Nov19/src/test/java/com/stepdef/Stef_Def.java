package com.stepdef;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.Adactin_Runner;
import com.pageobjectmanager.Page_Object_Manager_Adactin;
import com.reader.File_Reader_Manager;
import com.utilityFiles.Utility_Files;

import io.cucumber.java.en.*;

public class Stef_Def extends Utility_Files{

	public static WebDriver driver = Adactin_Runner.driver;
	
	public static Page_Object_Manager_Adactin  manage = new Page_Object_Manager_Adactin(driver);
	
	public static Logger log = Logger.getLogger(Adactin_Runner.class); // Check this line
	
	@Given("user Launch The Adactin Application")
	public void user_launch_the_adactin_application() {
	   
		get_Url("https://adactinhotelapp.com/");
		window_Commands("maximize");
		log.info("Login Page Session Created.");
	}
	
	@When("user Enter The Username In Username Field")
	public void user_enter_the_username_in_username_field() throws IOException {
	
		//Reading properties file using singleton
		String username1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getUsername_1();//Username 
		send_Keys(manage.getLogin().getEmail(),username1);
	}
	
	@When("user Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() throws IOException {
	
		String password1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getPassword_1();//Password
		send_Keys(manage.getLogin().getPassword(), password1);
	}
	
	@Then("user Click On The Login Btn, It Navigates To Adactin.com - Search Hotel")
	public void user_click_on_the_login_btn_it_navigates_to_adactin_com_search_hotel() {
	    
		click_On_Element(manage.getLogin().getLoginBtn());
		log.info("Logged in Successfully.");
	}
	
	@When("user Select The Location In Location Field")
	public void user_select_the_location_in_location_field() throws IOException {
	
		log.info("1st Hotel Booking Session Created.");
		String location = File_Reader_Manager.getInstanceFRM().getInstanceTD().getLocation_1();//location
		select_By_Value(manage.getSearchHotel().getLocation(), location);
	}
	
	@When("user Select The Hotel In Hotels Field")
	public void user_select_the_hotel_in_hotels_field() throws IOException {
		
		String hotelName1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getHotelName_1();//hotelname
		select_By_Visibletext(manage.getSearchHotel().getHotel(), hotelName1);
	}
	
	@When("user Select The Roomtype In Room Type Field")
	public void user_select_the_roomtype_in_room_type_field() throws IOException {
	   
		String roomType1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getRoomType_1();//roomtype
		select_By_Visibletext(manage.getSearchHotel().getRoomType(), roomType1);
	}
	
	@When("user Select The Numberofrooms In Number of Rooms Field")
	public void user_select_the_numberofrooms_in_number_of_rooms_field() throws IOException {
	
		String noOfRoom1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfRooms_1();//No of Rooms
		select_By_Visibletext(manage.getSearchHotel().getNoOfRooms(), noOfRoom1);
	}
	
	@When("user Enter The Checkindate In Check In Date Field")
	public void user_enter_the_checkindate_in_check_in_date_field() throws IOException {
		
		String checkInDate1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCheckInDate_1();//Checkin Date
		send_Keys(manage.getSearchHotel().getCheckInDate(), checkInDate1);
	}
	
	@When("user Enter The Checkoutdate In Check Out Date Field")
	public void user_enter_the_checkoutdate_in_check_out_date_field() throws IOException {
	
		String checkOutDate1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCheckOutDate_1();//Checkout Date
		send_Keys(manage.getSearchHotel().getCheckOutDate(), checkOutDate1);
	}
	
	@When("user Select The Adultsperroom In Adults per Room Field")
	public void user_select_the_adultsperroom_in_adults_per_room_field() throws IOException {
	
		String noOfAdult = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfAdult_1();//No Of Adult
		int noOfAdult1 = Integer.parseInt(noOfAdult); //Conveting to int bec of selectByIndex
		select_By_Index(manage.getSearchHotel().getNoOfAdult(), noOfAdult1);
	}
	
	@When("user Select The Childrenperroom In Children per Room Field")
	public void user_select_the_childrenperroom_in_children_per_room_field() throws IOException {
		
		String noOfChildren1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getNoOfChildren_1(); //No Of Children
		select_By_Value(manage.getSearchHotel().getNoOfChildren(), noOfChildren1);
	}
	
	@Then("user Click On The Search Btn, It Navigates To Adactin.com - Select Hotel")
	public void user_click_on_the_search_btn_it_navigates_to_adactin_com_select_hotel() {
		
		click_On_Element(manage.getSearchHotel().getSearchBtn());
	}

	@When("user Click On The Radio Btn, In Select Field")
	public void user_click_on_the_radio_btn_in_select_field() {
		
		click_On_Element(manage.getSlctHotel().getRadioBtn());
	}
	
	@Then("user Click On The Continue Btn, It Navigates To Adactin.com - Book A Hotel")
	public void user_click_on_the_continue_btn_it_navigates_to_adactin_com_book_a_hotel() {
	   
		click_On_Element(manage.getSlctHotel().getContinuBtn());
	}
	
	@When("user Enter The Firstname In First Name Field")
	public void user_enter_the_firstname_in_first_name_field() throws IOException {
		
		String firstName1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getFirstName_1();//First Name
		send_Keys(manage.getBookHotel().getFirstName(), firstName1);
	}
	
	@When("user Enter The Lastname In Last Name Field")
	public void user_enter_the_lastname_in_last_name_field() throws IOException {
		
		String lastName1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getLastName_1();//Last Name
		send_Keys(manage.getBookHotel().getLastName(), lastName1);
	}
	
	@When("user Enter The Billingaddress In Billing Address Field")
	public void user_enter_the_billingaddress_in_billing_address_field() throws IOException {
		
		String billingAddress1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getBillingAddress_1();//Billing Address 
		send_Keys(manage.getBookHotel().getBillingAddress(), billingAddress1);
	}
	
	@When("user Enter The Creditcardno In Credit Card No Field")
	public void user_enter_the_creditcardno_in_credit_card_no_field() throws IOException {
	   
		String creditCardNo1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCreditCardNo_1();//Credit Card No
		send_Keys(manage.getBookHotel().getCreditCardNo(), creditCardNo1);
	}
	
	@When("user Select The Creditcardtype In Credit Card Type Field")
	public void user_select_the_creditcardtype_in_credit_card_type_field() throws IOException {
	    
		String creditCardType1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCreditCardType_1();//Credit Card Type
		select_By_Visibletext(manage.getBookHotel().getCreditCardType(), creditCardType1);
	}
	
	@When("user Select The Month In Expiry Date Field")
	public void user_select_the_month_in_expiry_date_field() throws IOException {
		
		String expiryMonth1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getExpiryMonth_1();//Expiry Month
		select_By_Visibletext(manage.getBookHotel().getExpiryMonth(), expiryMonth1);
	}
	
	@When("user Select The Year In Expiry Date Field")
	public void user_select_the_year_in_expiry_date_field() throws IOException {
	
		String expiryYear1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getExpiryYear_1();
		select_By_Visibletext(manage.getBookHotel().getExpiryYear(), expiryYear1);
	}
	
	@When("user Enter The Cvvnumber In CVV Number Field")
	public void user_enter_the_cvvnumber_in_cvv_number_field() throws IOException {
	
		String ccvNo1 = File_Reader_Manager.getInstanceFRM().getInstanceTD().getCcvNo_1();
		send_Keys(manage.getBookHotel().getCvvNo(), ccvNo1);
	}
	
	@Then("user Click On The Book Now Btn, It Navigates To Adactin.com - Hotel Booking Confirmation")
	public void user_click_on_the_book_now_btn_it_navigates_to_adactin_com_hotel_booking_confirmation() {
		
		click_On_Element(manage.getBookHotel().getBookNowBtn());
	}
	
	@Then("user Click On Booked Itinerary Link, It Navigates To Adactin.com - Select Hotel")
	public void user_click_on_booked_itinerary_link_it_navigates_to_adactin_com_select_hotel() throws InterruptedException, IOException {
	    
		javascript_Executor_Scroll_Or_Click("scroll", manage.getBookingConfirmation().getBookedItenaryLnk());
		javascript_Executor_Scroll_Or_Click("click", manage.getBookingConfirmation().getBookedItenaryLnk());
		sleep(3000);
		//Screenshot of Casual Dress Order Confirmation
		takes_Screenshot("C:\\Users\\Tharani\\eclipse-workspace\\Cucumber_Project_Nov19\\Screenshot\\HotelBooking1.png");
	}
	
	@Then("user Click On Logout Link, It Navigates To Adactin.com - Logout")
	public void user_click_on_logout_link_it_navigates_to_adactin_com_logout() {
		
		click_On_Element(manage.getBookedItenary().getLogoutLnk());
		log.info("1st Hotel Booking Completed Successfully.");
	}

	@Then("user Click On Click here to login again Link, It Navigates To Adactin.com - Hotel Reservation")
	public void user_click_on_click_here_to_login_again_link_it_navigates_to_adactin_com_hotel_reservation() {
	    
		click_On_Element(manage.getLoginAgain().getLoginAgainLnk());
	}	
}
