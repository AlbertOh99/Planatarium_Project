Feature: Add new plant and moon findings

  # Happy path for Planets
  Scenario: As a user I would like to be able to add my planet findings
    Given   the user is logged in and on their home page.
    Given   the user has selected Planet on their drop down.
    When    the user provides valid details for their planet name
    And     the correct file type if they want to add a picture to thier discovered planet.
    When    the user clicks on the Submit Planet button
    Then    expected result should be the table refreshes with the correct updated information

    # Happy Path for Moons
  Scenario: As a user I would like to be able to add my moon findings
    Given   the user is logged in and on their home page.
    Given   the user has selected Moon on their drop down.
    When    the user provides correct details and files to create their Moon.
    And     the correct file type if they want to add a picture to their discovered Moon.
    When    the user clicks on the Submit Moon button
    Then    expected result should be the table refreshes with the correct updated information


    # Sad path for Planets
  Scenario Outline: The user tries to upload a planet with invalid names or file type
    Given the user is logged in and on their home page.
    Given   the user has selected Planet on their drop down.
    When    the user provides invalid details for their planet name "<planetName>"
    And     the user provides invalid file type for their planet image "<file>"
    When    the user clicks on the Submit Planet button
    Then    should get an Alert message "<messages>"
    Then    should remain on an unchanged home page.

    Examples:
      | planetName                      | file | messages            |
      # Invalid Names
      |                                 |      | Invalid planet name |
      | ThePlanetNameIs31CharactersNowW |      | Invalid planet name |
      | E-arth_3%                       |      | Invalid planet name |
      | Earth                           |      | Invalid planet name |
      # invalid file
      | Earth2                          | GIF  | Invalid file type   |


  Scenario Outline:The user tries to upload a moon with invalid names, planetID or file type
    Given   the user is logged in and on their home page.
    Given   the user has selected Moon on their drop down.
    When    the user provides invalid details for their moon name "<moonName>"
    And     the user provides invalid details for the planetID "<planetID>"
    And     the user provides invalid file type for their moon image "<file>"
    When    the user clicks on the Submit Moon button
    Then    should get an Alert message "<messages>"
    And     they should remain on an unchanged home page.

    Examples:
      | moonName                        | planetID | file | messages          |
      # Invalid Names
      |                                 | 1        |      | Invalid moon name |
      | TheMoonsNameIs31CharactersNowsW | 1        |      | Invalid moon name |
      | M-oon_3%                        | 1        |      | Invalid moon name |
      | Moon                            | 1        |      | Invalid moon name |
      # Invalid planetID
      | Moon2                           | 100      |      | Invalid planet ID |
      # invalid file
      | Moon2                           | 1        | GIF  | Invalid file type |