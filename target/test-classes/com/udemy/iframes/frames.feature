Feature: frame feature
Background: Open Site
Given I open frame site "https://www.way2tutorial.com/html/frame/frame_example2.html"

Scenario: Frame Scenario
When I click On Element inside Frame and I should be clicked
Then I Close Browser