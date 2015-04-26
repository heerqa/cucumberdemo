
Feature: Test Update Company Profile functionality

Scenario: verify the company profile name updating function
	Given User is on Home page
	When  user click on Company link
	And  user changs all the field and click save button
	Then  success message is displayed
	When open the company page
	Then all the field should be populated as per update
	
	
