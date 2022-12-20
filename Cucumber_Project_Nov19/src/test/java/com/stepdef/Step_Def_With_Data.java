package com.stepdef;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.adactin.runner.Adactin_Runner;
import com.pageobjectmanager.Page_Object_Manager_Adactin;
import com.reader.File_Reader_Manager;
import com.utilityFiles.Utility_Files;

import io.cucumber.java.en.*;

public class Step_Def_With_Data extends Utility_Files {
	
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

	



}
