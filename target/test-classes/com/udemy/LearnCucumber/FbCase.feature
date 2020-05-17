Feature: Facebook Features

Background: Common Steps for facebook
Given When I launch "https://www.facebook.com"

Scenario: Login Check for Facebook
When I enter UserName as "abc"
When I get UserName field text
When I clear UserName fiels
And I quit browser

Scenario: Verify Other Elements in Facebook
When I Click On Login
When I Select Gender
When I Click New Page
And I quit browser

Scenario: Verify Dropdown in Facebook
When I Enter Date as Index
When I Enter Month as Value
When I Enter Year as Visible Text
When I Get All Option from Year
And I quit browser