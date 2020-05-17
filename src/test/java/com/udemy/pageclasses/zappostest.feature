Feature: Zappos feature

Scenario: Product Search
Given User landed at HomePage
When User Clicked on Sigin and Navigate to Login Page
And User provide credentials and Navigate to User Search Page
And User Search Product "Shoe"
Then Product Search result should be displayed
@Regression
Scenario: Another Product Search
Given User landed at HomePage
When Zappos_User Clicked on Sigin and Navigate to Login Page
And Zappos_User provide credentials and Navigate to User Search Page
And Zappos_User Search Product "hats"
Then Zappos_User Search result should be displayed

Scenario: Favorites Scenario
Given User landed at HomePage
When Zappos_User Clicked on Sigin and Navigate to Login Page
And Zappos_User provide credentials and Navigate to User Search Page
And I Click on Favorites
And I Click On Home Page

#Scenario: Register Users
#Given User landed at HomePage
#When Zappos_User Clicked on Sigin and Navigate to Login Page
#And Click on Register
#And Register Users
#|Name|Email|
#|Ram1|ram1@g.com|
#|Ram2|ram2@g.com|
#|Ram3|ram3@g.com|