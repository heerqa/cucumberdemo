
Feature: Test Update Company Profile demo test

Scenario: verify the company profile name updating function
	Given User is logged in
	When  user click on Company link
	And  user change the compnay name and click save button
	Then  success message is displayed
	
