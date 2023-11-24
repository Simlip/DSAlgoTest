
Feature: Data Structure Introduction Module

  Scenario: DS introduction 
    Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    When User click on Get Started 
    And  User click on Sign in
    Given User is in Sign in page
    And  User enters "Username" and "Password"
    And  User click on login
    Then User should be redirected to the home page
    When User click on Get started button below DS introduction
    Then User should land in DS intro. page
    When User click on Time Complexity button
    Then User should land in Time Complexity of DS intro.
    And  Page title should be "Time Complexity"
    When User click on Practice Questions button
    Then User should be redirected to Practice Questions of DS intro.
    And  Page title should be "Practice Questions"
    And  User should navigate to back
    When User click on Try here button
    Then User should be redirected to a page having tryEditor with a Run button to test
    When User enters code from Excel and Run

