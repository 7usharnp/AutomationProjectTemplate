Feature: Personal Detail page edit profile popup

  Background:
    Given user is on Login page
    When user enter username
    And user enter password
    And clicks on sign in button
    Then user should land on personal detail page
    Then user click edit icon on profile picture

  Scenario: Empty form submit
    When user submit empty edit profile form
    Then user should get error validation message

  Scenario: form submitted with image size greater than 2mb
    When user gives image greater than 2 mb size
    Then error validation message maximum size exceed should be displayed.

  Scenario: Form submitted with image size smaller than 2mb
    When user submit image with size smaller than 2 mb
    And clicks submit button
    Then user should be redirected to personalDetailPage

  Scenario: Form submitter with video input

