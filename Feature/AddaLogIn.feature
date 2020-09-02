@log
Feature: Adda login feature Test
Scenario: User able to signin with valid credentials

	Given Open the window and Landing Page
	When Enter user name
	And Enter Password
	And Click on login button
	Then logIn successfull and take title 
	And close the window