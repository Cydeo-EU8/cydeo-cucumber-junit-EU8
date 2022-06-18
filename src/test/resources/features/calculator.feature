Feature: Calculator Tests

Background:
  Given User is on calculator page

  Scenario: Test Adding
    When User clicks "5" on calculator
    And User clicks "+" on calculator
    And User clicks "5" on calculator
    Then result "10" should be displayed
  @wip
Scenario: Test Subtracting
    When User clicks "9" on calculator
    And User clicks "–" on calculator
    And User clicks "5" on calculator
    Then result "4" should be displayed


