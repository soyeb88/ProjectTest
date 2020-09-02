@log
Feature: Amazon login feature Test
Scenario: User able to signin with valid credentials
	
	Given Go to home page
	When Click on the sign in button
	And Enter username
	And Enter Password
	And Click on submit button
	Then login should be successful
	 