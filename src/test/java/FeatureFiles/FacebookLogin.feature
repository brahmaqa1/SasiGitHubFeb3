Feature: login
In order to perform successfull login
as a user
I want to enter correct user name and password

Scenario:	 In order to verify  login to facebook
	Given user navigates to facebook website
	When user validates the Home page title
	Then user entered the user name
	And user entered the password
	Then user should be successfully logged in
	And it should display user name on right side
	And it should display "<user>" on right side