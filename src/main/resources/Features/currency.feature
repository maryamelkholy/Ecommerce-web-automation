@smoke
Feature: switch between currecncies
  Scenario: change to euro currency
  Given user is in homepage
    When user selects euro
    Then currency has changed in all items