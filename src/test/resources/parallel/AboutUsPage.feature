Feature: About Us page feature

  Background:
    Given user is on Login page
    When user enter username
    And user enter password
    And clicks on sign in button
    Then user should land on personal detail page

    Scenario: check global office count
      Then user clicks about us link of header
      And get global office account count
      Then  is should be "18+"

