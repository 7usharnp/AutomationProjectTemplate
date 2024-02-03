Feature: Footer feature

  Background:
    Given user is on Login page
    When user enter username
    And user enter password
    And clicks on sign in button
    Then user should land on personal detail page
    And user moves to footer section