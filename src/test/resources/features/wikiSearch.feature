Feature: Wikipedia search functionality and verifications

  Scenario: Wikipedia Search Functionality Title Verification
  Given User is on Wikipedia home page
  When User types Steve Jobs in the wiki search box
  And User clicks wiki search button
  Then User sees Steve Jobs is in the wiki title