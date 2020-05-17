Feature: Handling Browser Features

Scenario: Browser Operation verification
 Given Browser Launched with Url "https://www.google.com"
 When Browser Navigates To Url "https://www.facebook.com"
 And I maximize Browser
 And I Back to Old Url
 And I move to forward
 Then I close browser
 
 Scenario: Launch any site
   Given Browser Launched with Url "https://www.yahoo.com"
   And I maximize Browser
   Then I close browser
