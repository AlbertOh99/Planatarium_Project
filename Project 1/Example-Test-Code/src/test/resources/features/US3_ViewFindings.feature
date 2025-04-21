Feature: View personally added planets and moons

  Scenario: As a user I should be able to see what I have already submitted.
    Given the user is logged in and on their home page.
    Then user should see a table of their own planets and moons.