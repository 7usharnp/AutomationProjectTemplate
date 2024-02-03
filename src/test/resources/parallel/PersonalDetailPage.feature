Feature: Personal Detail page feature

  Background:
    Given user is on Login page
    When user enter username
    And user enter password
    And clicks on sign in button
    Then user should land on personal detail page

  Scenario: Reset passwored link
    When user clicks on reset password link
    Then user should be redirected to reset password popup


  Scenario: User fill personal detail form
    When User enter current company to "Amazon"
    And User enter current location to "Hydrabad"
    And current Designation to "Automation Engineer"
    And Birthdate to "30-03-1996"
    And Gender to "Male"
    And Marital status to "Married" from dropdown
    And Cybage location to "PUNE" from dropdown
    And LinkedIn url to "https://co.linkedin.com/"
    And twitter link to "https://twitter.com/"
    And Facebook link to "https://www.facebook.com/"

  Scenario: Edit profile picture
    When user click edit icon on profile picture
    Then user should be redirected to update profile page popup
