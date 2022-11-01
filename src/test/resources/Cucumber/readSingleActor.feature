Feature: Display a single actor from the database for the user, given a actorId
  As a user
  I want to be able to input an actorId
  So that I can view that actors details


  Scenario: There is an actor at that position in the database
    Given That an actor exists at the inputted position
    When a user requests the details of a single actor
    Then the actors details are displayed