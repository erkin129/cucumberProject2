Feature: Login Amazon
  Scenario: Login
    Given the user is on the login page
    When the user enter the valid credentials
    Then the user should be logged in