Feature: Examples of Cucumber data table implementations

  @wip
  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

    #to beautify the pipes above
    #mac: command + option + L
    #windows: control + alt + L