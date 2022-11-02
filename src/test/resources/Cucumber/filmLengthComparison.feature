Feature: Compare film lengths
  As a user
  I want to be able to compare the lengths of two films
  So that I can see which one is longer


  Scenario Outline: The user wants to compare lengths
    Given That the user has two films to compare each having their own length <length1> and <length2>
    When The films lengths are compared
    Then the program should calculate which is longer by returning the <output>
    #output

    Examples:
      | length1 | length2 | output |
      | 80      | 90      | 0      |
      | 90      | 90      | 1      |
      | 100     | 90      | 2      |