
Feature: Queue Module

  Background: Common steps for each scenario
    Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    When User click on Get Started 
    Then User should be redirected to the homepage
    When User clicks on Get Started button in the Queue pane after Logged in
    Then The user should be directed to "Queue" Page
 
  
  Scenario: Implementation of Queue in Python
    When The user clicks on "Implementation of Queue in Python" link
    Then The user should be directed to "Implementation of Queue in Python" Page
		Given The user is in the Implementation of Queue in Python page after logged in
		When The user clicks on Try Here button
		Then The user should be redirected to tryEditor page
		When User gives inputs from Excel file and clicks Run Button
		Then User gets output or alert message based on input
		And User go back to "Implementation of Queue in Python" page
		When The user clicks Practice Questions link
		Then The user should be in the Practice page
		
	Scenario: Implementation using collections.deque
		When The user clicks on "Implementation using collections.deque" link
		Then The user should be directed to "Implementation using collections.deque" Page
		Given The user is in the Implementation using collections.deque page 
		When The user clicks on Try Here button
		Then The user should be redirected to tryEditor page
		When User gives inputs from Excel file and clicks Run Button
		Then User gets output or alert message based on input
		And User go back to "Implementation using collections.deque" page
		When The user clicks Practice Questions link
		Then The user should be in the Practice page
		
	Scenario: Implementation using array
		When The user clicks on "Implementation using array" link
		Then The user should be directed to "Implementation using array" Page
		Given The user is in the Implementation using array page after logged in
		When The user clicks on Try Here button
		Then The user should be redirected to tryEditor page
		When User gives inputs from Excel file and clicks Run Button
		Then User gets output or alert message based on input
		And User go back to "Implementation using array" page
		When The user clicks Practice Questions link
		Then The user should be in the Practice page

	Scenario: Queue Operations
		When The user clicks on "Queue Operations" link
		Then The user should be directed to "Queue Operations" Page
		Given The user is in the Queue Operations page after logged in
		When The user clicks on Try Here button
		Then The user should be redirected to tryEditor page
		When User gives inputs from Excel file and clicks Run Button
		Then User gets output or alert message based on input
		And User go back to "Queue Operations" page
		When The user clicks Practice Questions link
		Then The user should be in the Practice page

		