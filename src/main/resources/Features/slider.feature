@smoke
Feature: home slider redirects user to the intended page
  Scenario: nokia slider
    Given user is in the home
    When user clicks on nokia slider
    Then user is directed to nokia page

  Scenario: iphone slider
    Given user is in the home
    When user clicks on iphone slider
    Then user is directed to iphone page