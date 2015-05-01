
Feature: Verify Read app and company earnings
	
	The purpose of this feature is to make sure that user
	as per role
	are able to read app
	
Scenario: Verify that owner can read app and company earnings
	Given User is logged in as owner
	When  user click on Earning tab
	Then  page name is Apps Earnings
	
	
Scenario: Verify that financiar can read app and company earnings
	Given User is logged in as financer
	When  user click on Earning tab
	Then  page name is Apps Earnings
	
	
Scenario: Verify that developer can read app and company earnings
	Given User is logged in as developer
	Then  Earning tab is not dispayed
