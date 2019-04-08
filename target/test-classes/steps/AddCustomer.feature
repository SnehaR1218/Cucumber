#Author: your.email@your.domain.com

@tag
Feature: To test add customer
    @tag1
  Scenario: To test customer ID generation
    Given The user is in add customer page
    When The user fill in customer details
  When the user clicks submit button
    Then the user should see the Customer ID.
   

  @tag2
  Scenario Outline: 
    

