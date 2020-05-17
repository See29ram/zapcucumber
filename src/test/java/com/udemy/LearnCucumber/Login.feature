Feature: User Login Feature
 Scenario: User Login Scenario
  Given User Login Page
  When I enter UserName and Password
    |u1|p1|
    |u2|p2|
    |u3|p3|
  Then Home Page Should be displayed
  
 Scenario Outline: WebSite With Tech Stack
 	Given WebSite "<Site>"
 		And Present in "<City>"
 		Then check "<Tech>" is the output
 		
 		Examples:
 		| Site | City | Tech |
 		| Google | Banglore | Java |
 		| FB | US | PHP |
 		| Microsoft | HYD | Csharp |