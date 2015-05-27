Feature: Purpose of this feature is to test he permission for user
	Owner, developer and financer should be able to access
	differnt functionality as per their access right. Other scenarios are 
	covered in other features, so only new scenarios are covered.
	
Function 	            Owner 	Developer 	Finance
Change Company Profile 	x 		
Add/Remove User 	    x 		
Add/Edit App 	        x 	     x 	
Earnings 	            x 		            x	



Scenario: Verify that developer has no access to Change Company Profile
Given User is logged in as developer
Then User is not able to see company link



Scenario: Verify that Finance has no access to Change Company Profile
Given User is logged in as financer
Then User is not able to see company link


Scenario: Verify that Finance has no access to Add/Edit App
Given User is logged in as financer
Then user is not able to see MyApp link