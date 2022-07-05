@zerobank
Feature: Find Transactions feature
  Background:
    Given the user is on the login page
    And User logins with username "username" and password "password"
    And the user navigates to "Account Activity" menu

  Scenario: Search date range
    Given the user accesses the Find Transactions tab
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the results should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-02" to "2012-09-06"
    And the results table should only not contain transactions dated "2012-09-01"
