

Feature: Registration

  Scenario: Registration scenario using data table
    Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    When User click on Get Started 
    When User click on Sign in
    When User click on Register
    Given User opens register page
    When User click on Register with all fields empty
    Then It should display an error "Please fill out this field." below Username textbox
    When User enters only username
        | Username | Password | Password confirmation |
        | rainTree |  [blank]        |   [blank]                    |
    And  User click on Register button with password empty
    Then It should display an error "Please fill out this field." below Password textbox
    When User enters username and password
        | Username | Password | Password confirmation |
        | rainTree | pass@12word |   [blank]                 | 
    And  User click on Register  button with password confirmation empty                    
    Then It should display an error "Please fill out this field." below Password confirmation textbox
    When User enters invalid password confirmation
        | Username | Password | Password confirmation |
        | rainTree | pass@12word | pass@34word |
    And User click on Register with invalid password confirmation    
    Then It should display an error "password_mismatch:The two password fields didn’t match."
    When User enters password with all numbers
        | Username | Password | Password confirmation |
        | rainTree | 12345678 |    12345678           |
    And  User click on Register button with invalid password  
    #Then It should display Change your password alert box
    When User enters valid username and password
        | Username | Password | Password confirmation |
        | WbcdTree34 | pass@12word | pass@12word |
    And  User click Register button with valid crediantials 
    Then User should be redirected to the home page with the message "New Account Created. You are logged in as "<Username>""             
    

        