
Feature: Sign Up
 sign up should be quicky
  Scenario: Sign Up successfully
    Given I should enter the correct deatils
    When I entered correct details 
    And If I enter the wrong deatils then log in will be invalid
    Then I should be able to log in with that details