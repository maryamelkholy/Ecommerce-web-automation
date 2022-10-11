@smoke
Feature: login using username & password

  Background:
    Given user go to login page
    And went to login page

  Scenario: valid data
    When user enters "blablablablabla@gmgm.com" and "p@ssw0rd"
    And click on login button
    Then user login successfully


  Scenario: invalid data
    When user enters "to@gmail.com" and "Sss"
    And click on login button
    Then user cannot login



