Feature: View personally added planets and moons


  Background:
    Given     the user is on the login page

  #Happy Path
  Scenario: As a user I should be able to see what I have already submitted.
    And       the user logs in with their username "Batman" and password "Iamthenight1939"
    Then      user should see a table of their own planets and moons


  # Using Robin as new user
  Scenario: As a new user I should not have any data in my findings table
    Given     the new user creates an account
    # Here because stale error occur if I don't manually go to login page
    Given     the user is on the login page
    And       the user logs in with their username "viewTest" and password "viewTest1"
    Then      user should see an empty table of their own planets and moons

  Scenario: As a user when I login, Moon creation input should be present
    When    the user logs in with their username "Batman" and password "Iamthenight1939"
    Then    Moon inputs should be present