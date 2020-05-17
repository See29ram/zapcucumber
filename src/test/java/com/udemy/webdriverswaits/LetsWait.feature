Feature: Wait features in WebDriver

Background: Open Pratice site for wait

Given I Open site "http://www.seleniumframework.com/Practiceform/"

Scenario: Fixed wait setup
When I wait for "Element2" to Click and I click
Then I close Browser

Scenario: Implicit wait setup
When I ImplicitWait for "Element3" and I click
Then I close Browser

Scenario: Explicit Wait Setup
When I ExplicitWait for "Element4" and I click
Then I close Browser