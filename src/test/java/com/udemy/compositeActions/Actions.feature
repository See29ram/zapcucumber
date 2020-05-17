Feature: Actions Class Features

Background: Actions class site
#Given I open Action Class Site "https://www.google.com"
Given I open Action Class Site "https://demoqa.com/droppable/" 

#Scenario: Actions Class Scenario
#When Drag an Drop Element
#And I close Action browser

Scenario: Action Class Click and Hold
When I Click and Hold and do release
Then I close Action browser

#Scenario: Action Class Keys
#When Caps Search in Google
#Then I close Action browser