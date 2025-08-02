Feature: Login Functionality

  Scenario Outline: Valid Login Test for multiple users
    Given User is on the login page
    When User enters username "<username>" and password "<password>"
    And User clicks on the Sign In button
    Then User should be navigated to the dashboard page

    Examples:
      | username           | password   |
      | admin@shophub.com  | admin123   |
      | user@example.com   | user123    |
      | guest@demo.com     | guest123   |
