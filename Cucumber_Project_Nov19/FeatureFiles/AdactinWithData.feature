Feature: Hotel Booking

@AdactinAccess
Scenario Outline: Login Page

Given user Launch The Adactin Application

When user Enter The Username "<username>" In Username Field

And user Enter The Password "<password>" In Password Field

Then user Click On The Login Btn, It Navigates To Adactin.com - Search Hotel

Examples:
|username|password|
|Yudhveer|abc12345|
|Suga|Shrie|
|Harsha|Harshu|
|TharaniA|Abc1234| 
 
@AdactinHotelBooking 
Scenario: Search Hotel

When user Select "Sydney" In Location Field

And user Select "Hotel Hervey" In Hotels Field

And user Select "Super Deluxe" In Room Type Field

And user Select "1 - One" In Number of Rooms Field

And user Enter Checkindate "24/12/2022" In Check In Date Field

And user Enter Checkoutdate "26/12/2022" In Check Out Date Field

And user Select Adultsperroom "2" In Adults per Room Field

And user Select Childrenperroom "1" In Children per Room Field

Then user Click On The Search Btn, It Navigates To "Adactin.com - Select Hotel"

@AdactinHotelBooking
Scenario: Select Hotel

When user Click On The Radio Btn, In Select Field 

Then user Click On The Continue Btn, It Navigates To "Adactin.com - Book A Hotel"

@AdactinHotelBooking
Scenario: Book A Hotel

When user Enter The Firstname "Srihari" In First Name Field

And user Enter The Lastname "Santosh" In Last Name Field

And user Enter The Billingaddress "Alphen Mews" In Billing Address Field

And user Enter The Creditcardno "6537289123645372" In Credit Card No Field

And user Select The Creditcardtype "American Express" In Credit Card Type Field

And user Select The Month "December" In Expiry Date Field

And user Select The Year "2022" In Expiry Date Field

And user Enter The Cvvnumber "456" In CVV Number Field

Then user Click On The Book Now Btn, It Navigates To "Adactin.com - Book A Hotel"

@AdactinBookingConfirmation
Scenario: Booking Confirmation

Then user Click On Booked Itinerary Link, It Navigates To "Adactin.com - Select Hotel"

@AdactinLogout
Scenario: Logout 

Then user Click On Logout Link, It Navigates To "Adactin.com - Logout" 

@AdactinLoginAgain
Scenario: Login Again 

Then user Click On Click here to login again Link, It Navigates To "Adactin.com - Hotel Reservation System"
