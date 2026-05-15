# -> comments in feature file

Feature: Login functionality
	Scenario: verify Login feature with valid credentials
	Given User Navigates On Login Page
	When User enters valid username "Admin"
	And User enters valid Password "admin123"
	And User click on login button
	Then Validates user login successfully
	