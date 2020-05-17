Feature: Window Handles
Background: Window handling site
Given When I open Site "http://www.seleniumframework.com/Practiceform/"

Scenario: Window handle scenario
When I click on new tab and I can work on element in new tab
Then I close window browser