@smoke
Feature: facebook
  Scenario: facebook
    Given user is in the homepage for follow
    When user clicks on facebook icon
    Then user is directed to "facebook" page

  Scenario: twitter
    Given user is in the homepage for follow
    When user clicks on twitter icon
    Then user is directed to "twitter" page

  Scenario: rss
    Given user is in the homepage for follow
    When user clicks on rss icon
    Then user is directed to "new-online-store" page

  Scenario: youtube
    Given user is in the homepage for follow
    When user clicks on youtube icon
    Then user is directed to "youtube" page