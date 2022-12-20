Feature: Hotel Booking

Scenario: Login Page

Given user Launch The Adactin Application

When user Enter The Username In Username Field

And user Enter The Password In Password Field

Then user Click On The Login Btn, It Navigates To Adactin.com - Search Hotel 

Scenario: Search Hotel

When user Select The Location In Location Field

And user Select The Hotel In Hotels Field

And user Select The Roomtype In Room Type Field

And user Select The Numberofrooms In Number of Rooms Field

And user Enter The Checkindate In Check In Date Field

And user Enter The Checkoutdate In Check Out Date Field

And user Select The Adultsperroom In Adults per Room Field

And user Select The Childrenperroom In Children per Room Field

Then user Click On The Search Btn, It Navigates To Adactin.com - Select Hotel

Scenario: Select Hotel

When user Click On The Radio Btn, In Select Field 

Then user Click On The Continue Btn, It Navigates To Adactin.com - Book A Hotel

Scenario: Book A Hotel

When user Enter The Firstname In First Name Field

And user Enter The Lastname In Last Name Field

And user Enter The Billingaddress In Billing Address Field

And user Enter The Creditcardno In Credit Card No Field

And user Select The Creditcardtype In Credit Card Type Field

And user Select The Month In Expiry Date Field

And user Select The Year In Expiry Date Field

And user Enter The Cvvnumber In CVV Number Field

Then user Click On The Book Now Btn, It Navigates To Adactin.com - Hotel Booking Confirmation

Scenario: Booking Confirmation

Then user Click On Booked Itinerary Link, It Navigates To Adactin.com - Select Hotel

Scenario: Logout 

Then user Click On Logout Link, It Navigates To Adactin.com - Logout 

Scenario: Login Again 

Then user Click On Click here to login again Link, It Navigates To Adactin.com - Hotel Reservation
