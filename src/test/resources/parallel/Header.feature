Feature: Header feature

  Background:
    Given user is on Login page
    When user enter username
    And user enter password
    And clicks on sign in button
    Then user should land on personal detail page
    And user moves to header section

  Scenario: user clicks home link of header
    When user clicks home button
    Then user should be redirected to home page

  Scenario: user clicks about us link of header
    When user clicks about us link of header
    Then user should be redirected to about us page

  Scenario: user clicks  business of header
    When user clicks business link of header
    Then user should be redirected to business page

  Scenario: user clicks  Testimonial of header
    When user clicks Testimonial link of header
    Then user should be redirected to Testimonial page

  Scenario: user clicks on Contact link of header
    When user click contact link of header
    Then user should be redirected to contact page
