Feature: Compare values of two films, to enable user to play top trumps
  As a user
  I want to be able to compare stats of two films
  So that I can play top trumps


  Scenario: My rentalRate is higher than the other film
    Given when my rentalRate stat is higher than the other film
    When the values are compared
    Then I should get a point
