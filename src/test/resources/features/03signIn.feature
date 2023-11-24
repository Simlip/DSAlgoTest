
Feature: Sign in to DS Algo Portal

  



  Scenario Outline: Sign in
    Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    When User click on Get Started 
    When User click on Sign in
    Given User is in the Sign In Page
    When I want to login with username "<name>" and password "<value>" and I clicked Login Button
    Then I verify the "<status>" in step
		And User should redirected to the home page if "<status>" is success with the message "<name>" "You are logged in"
		And User click Sign Out Button if "<status>" is success
		
    Examples: 
      | name  		| value 			| status  						|
      | 		  		|       			| Both Blank 					|
      | user1 		|       			| Password Blank    	|
      | user2 		|  abc  			| Both Invalid 				|
      | skywalkers|  abc  			| Password Invalid 		|
      | skywalkers| password150@| success    					|

      
      