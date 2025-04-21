Feature: User Registration

  # Any starting steps shared between ALL scenarios/scenario outlines can be declared in a Background
  Background:
    Given   the user is on the login page
    When    the user clicks the register link


  # Happy Path Scenario
  Scenario: Valid credential data should allow for be registration with the Planetarium

    When    the user provides a valid username
    And     the user provides a valid password
    # Note the syntax below, assuming you have a plugin for intelisence
    # the section wrapped in quotes tells Cucumber you want to inject the data
    # into the step code that is executed
    Then    an alert should appear saying "Account created successfully"
    And     the user should be redirected to the login page

  # Sad Path Scenario
  # Scenario Outline - expects a data table of information that cucumber will work with.
  Scenario Outline: Invalid credential data should not allow for registering with the Planetarium
    # The "<>" has cucumber look to a data table with the column name of what is inside the diamond brackets.
    When    the user provides username "<username>" while registering
    And     the user provides password "<password>" while registering
    Then    an alert should appear saying "<message>"
    And     the user should remain on the register page

  # Examples is used to create a data table that Cucumber will look to for test data during runtime
  # For each row of data, Cucumber will execute the associated Scenario Outline
  Examples:
    |username|password|message|
    # invalid username
    |Batman  |Bobb1   |Invalid username|
    |bobb    |Bobb1   |Invalid username|
    |Robin!%?|Bobb1   |Invalid username|
    |3obin   |Bobb1   |Invalid username|
    |thisoverthirtycharacterssssssss|Bobb1|Invalid username|
    # invalid password
    |Robin   |Bobb3   |Invalid Password|
    |Robin   |bobby   |Invalid Password|
    |Robin   |Bobby   |Invalid Password|
    |Robin   |bobb3   |Invalid Password|
    |Robin   |BOBB3   |Invalid Password|
    |Robin   |Bobb3!? |Invalid Password|
    |Robin   |3obbY   |Invalid Password|
