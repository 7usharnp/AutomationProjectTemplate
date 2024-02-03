Feature: login feature

  Background:
    Given user is on Login page

  Scenario: Login page title
    Then page title is "Log in | can-new-cybage"

  Scenario: Create account link
    When User clicks on create account link
    Then page title is "Create new account | can-new-cybage"


  Scenario: forgot password link click
    When user clicks on forgot password link
    Then user should be redirected to forgot password popup should appear

#  Scenario: User login with incorrect credentials
#    When user enter username {string}
#    And user enter password {string}
#    Then

  Scenario: user try to login with empty credentials
    When clicks on sign in button with empty form
    Then user should get erro validation message "Please enter Personal Email ID." below username input field
    And user should get error validation message "Please enter Password."  below username input field

  Scenario: User Login
    When user enter username
    And user enter password
    And clicks on sign in button
    Then user should land on personal detail page
