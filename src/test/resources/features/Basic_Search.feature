Feature: Check basic search functionality in iPulse


Scenario: Verifying basic search functionality
		Given open the iPulse application
		When insert testscriptuser into the username field
		And insert welcome123123 into the password field
		And click login button
		Then user should be login and logout button should be visible
		And click on search work order top menu
		And click on search button
		And pick first work order no.
		And insert into the work order field
		And click on search button
		Then first work order should be same as picked one