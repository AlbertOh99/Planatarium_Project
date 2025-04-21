Feature: Securely Logging In

  # Happy Path
  Scenario: The user provides correct login information.
    Given   the user is on the login page
    When    the user provides their login username
    And     the user provides their login password
    And     the user clicks on login
    Then    expected end result should successfully login
    And     the user should be redirected to their home page


    # Sad Path
  Scenario Outline: The user provides incorrect login information.
    Given   the user is on the login page
    When    the user provides their login username "<username>"
    And     the user provides their login password "<password>"
    And     the user clicks on login
    Then    an alert should appear saying "<message>"
    And     the user should be remain on the login page


    Examples:
      | username | password        | message             |
    # Wrong username
      | Batwoman | Iamthenight1939 | Invalid Credentials |
    # Wrong password
      | Batman   | Iamtheday1939   | Invalid Credentials |
