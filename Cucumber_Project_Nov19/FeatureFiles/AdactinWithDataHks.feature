Feature: Hotel Booking

Background: Login Page

Given user Launch The Adactin Application

When user Enter The Username "TharaniA" In Username Field

And user Enter The Password "Abc1234" In Password Field

Then user Click On The Login Btn, It Navigates To Adactin.com - Search Hotel

@Hervey
Scenario: Hotel Hervey

When user Select "Sydney" In Location Field

And user Select "Hotel Hervey" In Hotels Field

And user Select "Super Deluxe" In Room Type Field

And user Select "1 - One" In Number of Rooms Field

And user Enter Checkindate "24/12/2022" In Check In Date Field

And user Enter Checkoutdate "26/12/2022" In Check Out Date Field

And user Select Adultsperroom "2" In Adults per Room Field

And user Select Childrenperroom "1" In Children per Room Field

And user Click On The Search Btn, It Navigates To "Adactin.com - Select Hotel"

And user Click On The Radio Btn, In Select Field 

And user Click On The Continue Btn, It Navigates To "Adactin.com - Book A Hotel"

And user Enter The Firstname "Srihari" In First Name Field

And user Enter The Lastname "Santosh" In Last Name Field

And user Enter The Billingaddress "Alphen Mews" In Billing Address Field

And user Enter The Creditcardno "6537289123645372" In Credit Card No Field

And user Select The Creditcardtype "American Express" In Credit Card Type Field

And user Select The Month "December" In Expiry Date Field

And user Select The Year "2022" In Expiry Date Field

And user Enter The Cvvnumber "456" In CVV Number Field

And user Click On The Book Now Btn, It Navigates To "Adactin.com - Book A Hotel"

And user Click On Booked Itinerary Link, It Navigates To "Adactin.com - Select Hotel"

@Creek
Scenario: Hotel Creek

When user Select The "Brisbane" In Location Field

And user Select The "Hotel Creek" In Hotels Field2

And user Select The "Super Deluxe" In Room Type Field

And user Select The "1 - One" In Number of Rooms Field

And user Enter The Checkindate "28/12/2022" In Check In Date Field

And user Enter The Checkoutdate "30/12/2022" In Check Out Date Field

And user Select The Adultsperroom "2" In Adults per Room Field

And user Select The Childrenperroom "1" In Children per Room Field

And user Click On Search Btn, It Navigates To "Adactin.com - Select Hotel"

And user Click On Radio Btn, In Select Field 

And user Click On Continue Btn, It Navigates To "Adactin.com - Book A Hotel"

And user Enter Firstname "Mano" In First Name Field

And user Enter Lastname "Shrie" In Last Name Field

And user Enter Billingaddress "Alphen Mews" In Billing Address Field

And user Enter Creditcardno "6537289123645372" In Credit Card No Field

And user Select Creditcardtype "American Express" In Credit Card Type Field

And user Select Month "December" In Expiry Date Field

And user Select Year "2022" In Expiry Date Field

And user Enter Cvvnumber "256" In CVV Number Field

#And user Click On The Book Now Btn, It Navigates To "Adactin.com - Book A Hotel"

#And user Click On Booked Itinerary Link, It Navigates To "Adactin.com - Select Hotel"


#Then user Click On sLogout Link, It Navigates To "Adactin.com - Logout" 

#Then user Click On Click here to login again Link, It Navigates To "Adactin.com - Hotel Reservation System"
