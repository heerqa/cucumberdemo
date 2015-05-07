Feature: Test demo connections
	The purpose of this feature is to
	make sure that only Super Admin
	can read and edit demo connection
	
Scenario: Verify that Super Admin can read and edit demo connections
		Given User is logged in as super admin
		When  user click on Demo Connection tab
		And  edit all the fields
		And  user click on Demo Connection tab again
		Then updated values should be present on demo connection page
		
Scenario: Verify that Admin cannot see the demo connetion tab
		Given User is logged in as admin
		Then  Demo Connection tab is not displayed
		
		
		
Scenario: Verify that Operator cannot see the demo connection tab
		Given User is logged in as operator
		Then  Demo Connection tab is not displayed