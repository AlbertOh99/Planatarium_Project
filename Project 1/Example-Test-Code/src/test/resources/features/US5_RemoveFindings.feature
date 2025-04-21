Feature: Remove planet and moon findings

  # Happy Path
  Scenario: As a user I want to remove my planets
    Given the user is logged in and on their home page.
    Given the user has selected "Planet" on their drop down.
    When the user provides the valid data for the Planet they wish to delete.
    When the user presses the "Delete" button.
    Then expected result should be that the table is refresh with the correct data deleted.


  # Happy Path
  Scenario: As a user I want to remove my moons
    Given the user is logged in and on their home page.
    Given the user has selected "Moon" on their drop down.
    When the user provides the valid data for the Moon they wish to delete.
    When the user presses the "Delete" button.
    Then expected result should be that the table is refresh with the correct data deleted.


  Scenario Outline: The user tries to delete a planet they don't have
    Given   the user is logged in and on their home page.
    Given   the user has selected "planet" on their drop down.
    When    the user provides invalid name for the planet "<planetName>" they wish to delete.
    Then    expected result should be an Alert message "<message>"
    And     they should remain on an unchanged home page.

    Examples:
      | planetName      | message               |
      | IAmNotInTheData | "Invalid planet name" |

  Scenario Outline: The user tries to delete a moon they don't have
    Given   the user is logged in and on their home page.
    Given   the user has selected "moon" on their drop down.
    When    the user provides invalid name for the moon "<moonName>" they wish to delete.
    Then    expected result should be an Alert message "<message>"
    And     they should remain on an unchanged home page.

    Examples:
      | moonName        | message             |
      | IAmNotInTheData | "Invalid moon name" |