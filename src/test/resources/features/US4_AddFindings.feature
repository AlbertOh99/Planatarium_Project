Feature: Add new plant and moon findings

  Background:
    Given     the user is on the login page
    And       the user logs in with their username "Batman" and password "Iamthenight1939"
  # Happy path for Planets
  Scenario Outline: As a user I would like to be able to add my planet findings
    Given   the user has selected "Planet" on their drop down
    When    the user provides details for their planet name "<planetName>"
    And     the user provides file type for their planet image "<file>"
    When    the user clicks on the Submit button
    Then    expected result should be the table refreshes with the correct updated information with celestial name "<planetName>"
    And     the user remains on home page

    Examples:
      | planetName                      | file |
      | Earth2                          |src/test/resources/images/goodJPG.jpg|
      | Earth2                          |src/test/resources/images/goodJPEG.jpeg|
      | Earth2                          |src/test/resources/images/goodPNG.png|
      | Earth2                          | |

    # Sad path for Planets
  Scenario Outline: The user tries to upload a planet with invalid names or file type
    Given   the user has selected "Planet" on their drop down
    When    the user provides details for their planet name "<planetName>"
    And     the user provides file type for their planet image "<file>"
    When    the user clicks on the Submit button
    Then    an alert should appear saying "<messages>"
    And     the user remains on home page

    Examples:
      | planetName                      | file | messages            |
      # Invalid Names
      |                                 |      | Invalid planet name |
      | ThePlanetNameIs31CharactersNowW |      | Invalid planet name |
      | E-arth_3%                       |      | Invalid planet name |
      | Earth                           |      | Invalid planet name |
      # invalid file
      | Earth2                          | src/test/resources/images/No.gif | Invalid file type |


  # Happy Path for Moons
  Scenario Outline: As a user I would like to be able to add my moon findings
    Given   the user has selected "Moon" on their drop down
    When    the user provides details for their moon name "<moonName>"
    And     the user provides details for the planetID 1
    And     the user provides file type for their moon image "<file>"
    When    the user clicks on the Submit button
    Then    expected result should be the table refreshes with the correct updated information with celestial name "<moonName>"
    And     the user remains on home page

    Examples:
      | moonName                      | file |
      | Moon2                          |D:\Revature\EricTrainingGithub\Copy of Instructor Notes\Project 1\Example-Test-Code\src\test\resources\images\goodJPG.jpg|
      | Moon2                          |D:\Revature\EricTrainingGithub\Copy of Instructor Notes\Project 1\Example-Test-Code\src\test\resources\images\goodJPEG.jpeg|
      | Moon2                          |D:\Revature\EricTrainingGithub\Copy of Instructor Notes\Project 1\Example-Test-Code\src\test\resources\images\goodPNG.png|
      | Moon2                          |                                                                                                                       |

  Scenario Outline:The user tries to upload a moon with invalid names, planetID or file type
    Given   the user has selected "Moon" on their drop down
    When    the user provides details for their moon name "<moonName>"
    And     the user provides details for the planetID <planetID>
    And     the user provides file type for their moon image "<file>"
    When    the user clicks on the Submit button
    Then    an alert should appear saying "<messages>"
    And     the user remains on home page

    Examples:
      | moonName                        | planetID | file | messages          |
      # Invalid Names
      |                                 | 1        |      | Invalid moon name |
      | TheMoonsNameIs31CharactersNowsW | 1        |      | Invalid moon name |
      | M-oon_3%                        | 1        |      | Invalid moon name |
      | Luna                            | 1        |      | Invalid moon name |
      # Invalid planetID
      | Moon2                           | 100      |      | Invalid planet ID |
      # invalid file
      | Moon2                           | 1        | src/test/resources/images/No.gif | Invalid file type |