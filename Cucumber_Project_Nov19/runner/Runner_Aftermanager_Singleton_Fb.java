package com.singleton.runner;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pageobjectmanager.Page_Object_Manager_Fb;
import com.reader.File_Reader_Manager_Fb;
import com.utilityFiles.Utility_Files;

public class Runner_Aftermanager_Singleton_Fb extends Utility_Files {
	
	public static WebDriver driver = browser_Config("chrome");
	
	public static Page_Object_Manager_Fb manager= new Page_Object_Manager_Fb(driver);
	
	public static Logger log = Logger.getLogger(Runner_Aftermanager_Singleton_Fb.class);
	
	public static void main(String[] args) throws IOException {
	
		BasicConfigurator.configure();
		
		window_Commands("maximize");
		
		get_Url("https://www.facebook.com/");
		
		log.info("Url Launched");
		
		String email = File_Reader_Manager_Fb.getFRM_FB().getTD_FB().getEmail();
		
		send_Keys(manager.getLogin().getEmail(), email); 
		
		log.info("Emailid data passed");
		
		String password = File_Reader_Manager_Fb.getFRM_FB().getTD_FB().getPassword();
		
		send_Keys(manager.getLogin().getPassword(), password);
		
		log.info("Password data passed");
		
		click_On_Element(manager.getLogin().getLogin());
		
		log.info("Clicked Login Button");
	}
}