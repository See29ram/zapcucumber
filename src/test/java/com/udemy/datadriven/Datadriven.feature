Feature: Excel read utilites
Scenario Outline: scenario description
	Given Logint to Website "<site>"
    When enter username "<uid>"
	And enter password "<pwd>"
		
		Examples:
		| site | uid | pwd |
		| google | user1 | pwd1 |
		| yahoo | user2 | pwd2 |
		| facebook | user3 | pwd3 |
