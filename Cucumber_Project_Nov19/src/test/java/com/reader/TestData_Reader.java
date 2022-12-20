package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestData_Reader {
	
	public static Properties p; //Creating reference for Properties class
	
	public TestData_Reader() throws IOException
	{
		File f = new File(
				"C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\src\\main\\java\\com\\properties\\TestData.properties");//Propfile location
		FileInputStream fis = new FileInputStream(f); //read data from file
		p = new Properties(); 
		p.load(fis); //load the file
	}
	
	//Reading data from Testdata.properties file
	
	public String getUsername_1()
	{
		String username1 = p.getProperty("username1");
		return username1;
	}
	
	public String getPassword_1()
	{
		String password1 = p.getProperty("password1");
		return password1;
	}
	
	//1st Hotel Booking - Hotel Details 
	public String getLocation_1()
	{
		String location1 = p.getProperty("location1");
		return location1;
	}
	
	public String getHotelName_1()
	{
		String hotelName1 = p.getProperty("hotelname1");
		return hotelName1;
	}
	
	public String getRoomType_1()
	{
		String roomType1 = p.getProperty("roomtype1");
		return roomType1;
	}
	
	public String getNoOfRooms_1()
	{
		String noOfRooms1 = p.getProperty("noofrooms1");
		return noOfRooms1;
	}
	
	public String getCheckInDate_1()
	{
		String checkInDate1 = p.getProperty("checkindate1");
		return checkInDate1;
	}
	
	public String getCheckOutDate_1()
	{
		String checkOutDate1 = p.getProperty("checkoutdate1");
		return checkOutDate1;
	}
	
	public String getNoOfAdult_1()
	{
		String noOfAdult1 = p.getProperty("noofadult1");
		return noOfAdult1;
	}
	
	public String getNoOfChildren_1()
	{
		String noOfChildren1 = p.getProperty("noofchildren1");
		return noOfChildren1;
	}
	
	//1st Hotel Booking - Personal Details
	public String getFirstName_1()
	{
		String firstName1 = p.getProperty("firstName1");
		return firstName1;
	}
	
	public String getLastName_1()
	{
		String lastName1 = p.getProperty("lastName1");
		return lastName1;
	}
	
	public String getBillingAddress_1()
	{
		String billingAddress1 = p.getProperty("billingAddress1");
		return billingAddress1;
	}
	
	public String getCreditCardNo_1()
	{
		String creditCardNo1 = p.getProperty("creditCardNo1");
		return creditCardNo1;
	}
	
	public String getCreditCardType_1()
	{
		String creditCardType1 = p.getProperty("creditCardType1");
		return creditCardType1;
	}
	
	public String getExpiryMonth_1()
	{
		String expiryMonth1 = p.getProperty("expiryMonth1");
		return expiryMonth1;
	}
	
	public String getExpiryYear_1()
	{
		String expiryYear1 = p.getProperty("expiryYear1");
		return expiryYear1;
	}
	
	public String getCcvNo_1()
	{
		String ccvNo1 = p.getProperty("ccvNo1");
		return ccvNo1;
	}
	
	//2nd Hotel Booking - Hotel Details 
		public String getLocation_2()
		{
			String location2 = p.getProperty("location2");
			return location2;
		}
		
		public String getHotelName_2()
		{
			String hotelName2 = p.getProperty("hotelname2");
			return hotelName2;
		}
		
		public String getRoomType_2()
		{
			String roomType2 = p.getProperty("roomtype2");
			return roomType2;
		}
		
		public String getNoOfRooms_2()
		{
			String noOfRooms2 = p.getProperty("noofrooms2");
			return noOfRooms2;
		}
		
		public String getCheckInDate_2()
		{
			String checkInDate2 = p.getProperty("checkindate2");
			return checkInDate2;
		}
		
		public String getCheckOutDate_2()
		{
			String checkOutDate2 = p.getProperty("checkoutdate2");
			return checkOutDate2;
		}
		
		public String getNoOfAdult_2()
		{
			String noOfAdult2 = p.getProperty("noofadult2");
			return noOfAdult2;
		}
		
		public String getNoOfChildren_2()
		{
			String noOfChildren2 = p.getProperty("noofchildren2");
			return noOfChildren2;
		}
		
		//1st Hotel Booking - Personal Details
		public String getFirstName_2()
		{
			String firstName2 = p.getProperty("firstName2");
			return firstName2;
		}
		
		public String getLastName_2()
		{
			String lastName2 = p.getProperty("lastName2");
			return lastName2;
		}
		
		public String getBillingAddress_2()
		{
			String billingAddress2 = p.getProperty("billingAddress2");
			return billingAddress2;
		}
		
		public String getCreditCardNo_2()
		{
			String creditCardNo2 = p.getProperty("creditCardNo2");
			return creditCardNo2;
		}
		
		public String getCreditCardType_2()
		{
			String creditCardType2 = p.getProperty("creditCardType2");
			return creditCardType2;
		}
		
		public String getExpiryMonth_2()
		{
			String expiryMonth2 = p.getProperty("expiryMonth2");
			return expiryMonth2;
		}
		
		public String getExpiryYear_2()
		{
			String expiryYear2 = p.getProperty("expiryYear2");
			return expiryYear2;
		}
		
		public String getCcvNo_2()
		{
			String ccvNo2 = p.getProperty("ccvNo2");
			return ccvNo2;
		}
}
