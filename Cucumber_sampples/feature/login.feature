
Feature: log in into TestMe App

  Scenario: Successful login into the TestMe App
    Given I need to go the valid application site
    When I entered valid username and password correct
    And If i entered the wrong username and password details it will pop up the invalid unsername password message
    Then I have logged in successfully
   
 