Feature: User should be able to login using correct credentials

  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters "username"
    And user enters "password"
    And user clicks to login button
    Then user should see url contains orders

