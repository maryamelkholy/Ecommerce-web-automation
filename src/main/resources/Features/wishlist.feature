@smoke
Feature: wishlist works properly
  Scenario: wishlist for htc mobile
    Given user is in the homepage for htc
    When user clicks on like icon for htc mobile
    Then success message is displayed above
    And message is green

  Scenario: wishlist has items
    Given user is in the homepage for htc
    When user clicks on like icon for htc mobile
    And user clicks on wishlist
    Then user finds more than 1 product

