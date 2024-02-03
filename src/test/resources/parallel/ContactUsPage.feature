Feature: Contact us page Feature

  Background:
    Given user is on Login page
    When user enter username
    And user enter password
    And clicks on sign in button
    Then user should land on personal detail page
    When user click contact link of header

  Scenario: Empty form submission
    When user submit form empty
    Then user should get validation message "Your Message field is required." for send to and your message fields.

  Scenario: User send request regarding queries and general information
    When user select option "Queries & General Information" from dropdown
    And enter "How I can approach my friends" in your message input field
    And enter name as "tushar"
    And click submit button of contact us form
    Then user should be redirect to success msg
