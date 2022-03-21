Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders

