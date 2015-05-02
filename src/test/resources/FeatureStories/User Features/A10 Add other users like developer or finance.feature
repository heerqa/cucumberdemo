Feature: Verify that Owner is able to add developer of financer as new user for the company

Scenario: Verify that Owner is able to add new user as developer
		Given User is on Home page
		When  user click on Company link
		And user click on New User button
		Then New User page is displayed
		When User enters all the fields
		And user click on send an invitation button
		Then the user is displayed on Compnay Team section
		And remove the newly added user 
		
Scenario: Verify that Owner is able to add new user as finacar
		Given User is on Home page
		When  user click on Company link
		And user click on New User button
		Then New User page is displayed
		When User enters all the fields and select finance
		And user click on send an invitation button
		Then the user is displayed on Compnay Team section as finance
		And remove the newly added user 