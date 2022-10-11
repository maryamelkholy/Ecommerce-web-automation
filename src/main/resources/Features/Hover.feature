@smoke
Feature: Hover page is corrent
  Scenario: click, right page
    Given user is in the homepage
    When main menu is clicked
    And first choice is chosen from submenu
    Then user is directed to the intended page