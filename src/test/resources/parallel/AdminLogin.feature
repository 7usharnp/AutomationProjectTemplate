Feature: Admin login feature

  Background:
    Given user is on Login page


  Scenario: Login with correct credentials for admin
    When user enter admin username
    And user enter admin password
    And clicks on sign in button
    Then user should land on personal detail page
