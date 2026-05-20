Feature: Automation Exercise Login Feature

	Scenario Outline: Verify login functionality with multiple data.
	Given I am on Login Page
	When I enter "<username>" and "<password>"
	And I click on automationexercise login button
	Then Validate result
	
	Examples:
	|  username  			     | password     |
	|   Admin          	 	   	 |  admin123    |
	| sonwanepooja888@gmail.com  | Pooja@123    |