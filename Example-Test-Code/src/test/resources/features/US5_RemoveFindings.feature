Feature: Remove planet and moon findings


  Background:
    Given     the user is on the login page
    And       the user logs in with their username "Batman" and password "Iamthenight1939"
  # Happy Path
  Scenario: As a user I want to remove my planets
    Given   the user has selected "Planet" on their drop down
    When    the user provides details for the celestial name "Earth" they wish to delete
    When    the user presses the Delete button
    Then    expected result should be that the table is refresh with the correct data deleted "Earth"


  # Happy Path
  Scenario: As a user I want to remove my moons
    Given   the user has selected "Moon" on their drop down
    When    the user provides details for the celestial name "Luna" they wish to delete
    When    the user presses the Delete button
    Then    expected result should be that the table is refresh with the correct data deleted "Luna"


  Scenario: The user tries to delete a planet they don't have
    Given   the user has selected "Planet" on their drop down
    When    the user provides details for the celestial name "IAmNotInTheData" they wish to delete
    When    the user presses the Delete button
    Then    an alert should appear saying "Invalid planet name"
    And     the user remains on home page


  Scenario: The user tries to delete a moon they don't have
    Given   the user has selected "Moon" on their drop down
    When    the user provides details for the celestial name "IAmNotInTheData" they wish to delete
    When    the user presses the Delete button
    Then    an alert should appear saying "Invalid moon name"
    And     the user remains on home page

