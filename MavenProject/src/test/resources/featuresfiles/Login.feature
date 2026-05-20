# -> comments in feature file

Feature: Login functionality

	Background:
		Given User Navigates On OrangeHRM Login Page
		
		
	Scenario: verify Login feature with valid credentials
	#Given User Navigates On Login Page
	When User enters valid username "Admin"
	And User enters valid Password "admin123"
	And User click on OrangeHRM login button
	Then Validates user login successfully
	
	
	Scenario: verify Login feature with invalid credentials
	#Given User Navigates On Login Page
	When User enters invalid username "Test123"
	And User enters invalid Password "Test123"
	And User click on OrangeHRM login button
	Then User is not logins
	
	
	Scenario: verify Login feature with valid username and invalid password
	#Given User Navigates On Login Page
	When User enters valid username "Admin"
	And User enters invalid Password "Test123"
	And User click on OrangeHRM login button
	Then User is not login
	
	Scenario: verify Login feature with invalid username and valid password 
	#Given User Navigates On Login Page
	When User enters invalid username "Test123"
	And User enters invalid Password "admin123"
	And User click on OrangeHRM login button
	Then User is not login