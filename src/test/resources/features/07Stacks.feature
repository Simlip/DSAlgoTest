
Feature: Stack Module

  Background: Common steps for each scenario
    Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    When User click on Get Started 
    Then User should be redirected to the homepage
    When User clicks on Get Started button in the Stack pane after Logged in
    Then The user should be directed to "Stack" Page
  
  
  Scenario: Operations in Stack
    When The user clicks "Operations in Stack" link
    Then The user should be directed to "Operations in Stack" Page
		Given The user is in the Operations in Stack page after logged in
		When The user clicks Try Here button
		Then The user should be redirected to tryEditor page
		When User gives inputs from Excel and clicks Run Button
		Then User gets output or alert message based on input
		And User navigates back to "Operations in Stack" page
		When The user clicks Practice Questions button
		Then The user should be in the "Practice" page
		
	Scenario: Implementation
		When The user clicks "Implementation" link
		Then The user should be directed to "Implementation" Page
		Given The user is in the Implementation page 
		When The user clicks Try Here button
		Then The user should be redirected to tryEditor page
		When User gives inputs from Excel and clicks Run Button
		Then User gets output or alert message based on input
		And User navigates back to "Implementation" page
		When The user clicks Practice Questions button
		Then The user should be in the "Practice" page
		
	Scenario: Applications
		When The user clicks "Applications" link
		Then The user should be directed to "Applications" Page
		Given The user is in the Applications page after logged in
		When The user clicks Try Here button
		Then The user should be redirected to tryEditor page
		When User gives inputs from Excel and clicks Run Button
		Then User gets output or alert message based on input
		And User navigates back to "Applications" page
		When The user clicks Practice Questions button
		Then The user should be in the "Practice" page

		