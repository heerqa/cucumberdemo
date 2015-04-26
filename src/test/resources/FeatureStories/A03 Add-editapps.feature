
Feature: A03 Add edit apps

Scenario: verify the company ownner can add and edit the app
	Given User is logged in as owner
	When  user click on MyApp
	And  user click on NewApp
	Then  new app page is displayed
	When user enter all the valid field values and click Create App
	Then newly created app page is displayed
	When  user click on MyApp
	Then  new app should be displayed 
	When click on recent app
	Then edit app page is displayed
	When click on edit
	Then edit app page is displayed
	When enter new field
	And click Update app
	Then app page is displayed
	And new name is displayed
	When click on Back button
	Then App listing page is displayed
	And  app name is updated
	

	Scenario: verify the company developer can add and edit the app
	Given User is logged in as developer
	When  user click on MyApp
	And  user click on NewApp
	Then  new app page is displayed
	When user enter all the valid field values and click Create App
	Then newly created app page is displayed
	When  user click on MyApp
	Then  new app should be displayed 
	When click on recent app
	Then edit app page is displayed
	When click on edit
	Then edit app page is displayed
	When enter new field
	And click Update app
	Then app page is displayed
	And new name is displayed
	When click on Back button
	Then App listing page is displayed
	And  app name is updated
	
	Scenario: verify the company financer cannot add and edit the app
	Given User is logged in as financer
	Then  Myapp is not displayed
	