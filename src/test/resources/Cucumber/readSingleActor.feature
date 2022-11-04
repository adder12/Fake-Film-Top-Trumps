Feature: Display a single actor from the database for the user, given a actorId
  As a user
  I want to be able to input an actorId
  So that I can view that actors details


  Scenario Outline: There is an actor at that position in the database
    Given That an actor exists at position <ID>
    When a user requests the details of a single actor
    Then the actors details "<firstName>" "<lastName>" are displayed


    Examples:
      | ID  | firstName | lastName |
      | 1   | PENELOPE  | GUINESS  |
      | 51  | GARY      | PHOENIX  |
      | 18  | DAN       | TORN     |
      | 116 | DAN       | STREEP   |
