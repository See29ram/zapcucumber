Feature: FaceBook Post

  Background: Common Steps
    Given User Logged in Facebook

  Scenario: Facebook Wall Message Verfication
    And Type Message as "This is my first Post" On Post Wall
    When User Click On Post
    Then Post Should be Displayed On wall

  Scenario: Facebook Video Post Verification
    And Upload Video from "Youtube Link" on Wall
    When User Click on Post Video
    Then Post Video should apper On Wall
