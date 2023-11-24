Feature: Array in Data Structure Module


  Background: Common steps for each scenario
    Given User launch Chrome Browser
    And   User opens URL "https://dsportalapp.herokuapp.com"
    When  User click on Get Started 
    Then  User is navigated to the Home page
    When  User clicks on Get Started button of Array Data Structure
    Then  User is navigated to the Array page
    And   The page title is "Array"

    Scenario: Arrays in Python 
    When  User clicks on Arrays in Python button
    Then  The user is navigated to the page where the header is "Arrays in Python"
    And   User click on Try here buttton
    Then  User is taken to a Try Editor page
    And  User enters code from excel and clicks Run
    And  User navigates back to the previous page

    Scenario: Arrays Using List
    When  User clicks on the Arrays Using List option 
    Then  The user is navigated to the page where the header is "Arrays Using List"
    And   User click on Try here buttton
    Then  User is taken to a Try Editor page
    And   User enters code from excel and clicks Run
    And   User navigates back to the previous page


    Scenario: Basic Operations in Lists
    When  User clicks on the Basic Operations in Lists option 
    Then  The user is navigated to the page where the header is "Basic Operations in Lists"
    And   User click on Try here buttton
    Then  User is taken to a Try Editor page
    And   User enters code from excel and clicks Run
    And   User navigates back to the previous page


    Scenario: Applications in Array
    When  User clicks on the Applications of Array option 
    Then  The user is navigated to the page where the header is "Applications of Array"
    And   User click on Try here buttton
    Then  User is taken to a Try Editor page
    And   User enters code from excel and clicks Run
    And   User navigates back to the previous page

    Scenario: Search the Array Question
    When  User clicks on Arrays in Python button
    Then  User clicks on the Practice Questions option
    And   The user is navigated to the page having four questions
    When  The user clicks on the Search the Array option
    Then  The user is navigated to the Question page 
    When  User clicks Run
    Then  The result is displayed
    #And  The result displayed is "True False"
    When  User clicks Submit
    Then  The result displayed is "Error occurred during submission"    
    And   User navigates back to the previous page

    Scenario: Max Consecutive Ones Question 
    When  User clicks on Arrays in Python button
    Then  User clicks on the Practice Questions option
    And   The user is navigated to the page having four questions
    When  User clicks on the Max Consecutive Ones option 
    Then  The user is navigated to the Question page 
    When  User clicks Run
    Then  The result is displayed
    #And  The result displayed is "True False" 
    When  User clicks Submit 
    Then  The result displayed is "Error occurred during submission"
    And   User navigates back to the previous page

    Scenario: Find Numbers with Even Number of Digits Question
    When  User clicks on Arrays in Python button
    Then  User clicks on the Practice Questions option
    And   The user is navigated to the page having four questions 
    When  User clicks on the Even Number of Digits option 
    Then  The user is navigated to the Question page
    When  User clicks Run
    Then  The result is displayed
    #And  The result displayed is "True False" 
    When  User clicks Submit 
    Then  The result displayed is "Error occurred during submission"     
    And   User navigates back to the previous page

    Scenario: Squares of a Sorted Array Question 
    When  User clicks on Arrays in Python button
    Then  User clicks on the Practice Questions option
    And   The user is navigated to the page having four questions
    When  User clicks on the Squares of a Sorted Array option 
    Then  The user is navigated to the Question page 
    When  User clicks Run
    Then  The result is displayed
    #And  The result displayed is "False"  
    When  User clicks Submit 
    Then  The result displayed is " No tests were collected"   
    And   User navigates back to the previous page