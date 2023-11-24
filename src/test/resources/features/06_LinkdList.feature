
@tag
Feature: Linked List Module

 Background: Common steps of each Scenario
    Given User launch Chrome Browser
    And  User opens URL "https://dsportalapp.herokuapp.com"
    When User click on Get Started 
    #And  User click on Sign in
    #And  User enters "skywalkers" as Username and "password150@" as Password
    #And  User click on login
    Then User should be redirected to the home page 
    When User click on Get Started button below Linked List
    Then User should be redirected to the linked list page
 Scenario: Linked List Introduction
    When User click on Introduction 
    Then User should be redirected to the introduction page of linked list
    When User  will click on Try here 
    Then User will land in a tryEditor page
    When User enters code from Excel and Run the code
    Then User navigate to back
 Scenario: Creating Linked List 
    When User click on Creating Linked List
    Then User should be redirected to the Creating Linked List page
    When User should  click on Try here button on the creating Linked List page
    Then User will land in a tryEditor page 
    When User enters code from Excel and Run the code
    Then User navigate to back
 Scenario: Types of Linked List   
    When User click on Types of Linked List
    Then User should be redirected to the Types Of Linked List page
    When User should  click on Try here button on the Types of Linked List page
    Then User will land in a tryEditor page 
    When User enters code from Excel and Run the code
    Then User navigate to back
 Scenario: Implement Linked List in Python   
    When User click on Implement Linked List in Python
    Then User should be redirected to the Implement Linked List in Python page
    When User should  click on Try here button on the Implement Linked List page
    Then User will land in a tryEditor page 
    When User enters code from Excel and Run the code
    Then User navigate to back
 Scenario: Traversal  
    When User click on Traversal
    Then User should be redirected to the Traversal page
    When User should  click on Try here button on Traversal page 
    Then User will land in a tryEditor page 
    When User enters code from Excel and Run the code
    Then User navigate to back
 Scenario: Insertion
    When User click on Insertion 
    Then User should be redirected to the Insertion page
    When User should  click on Try here button on the Insertion page 
    Then User will land in a tryEditor page 
    When User enters code from Excel and Run the code
    Then User navigate to back  
 Scenario: Deletion
    When User click on Deletion
    Then User should be redirected to the Deletion page    
    When User should  click on Try here button on the Deletion page 
    Then User will land in a tryEditor page 
    When User enters code from Excel and Run the code
    Then User navigate to back 
 Scenario: Practice Questions  
    When User click on Introduction
    When User click on Practice Questions
    Then User should be redirected to the Practice Questions page
    And  Title should be "Practice Questions"
    And  User navigate to back
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     