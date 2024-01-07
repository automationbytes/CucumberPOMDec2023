Feature: To perform a demo with Cucumber POM

  Scenario: Login and Logout

    Given the user launches the NOPAdmin URL
    Then the user verifies the loginpage is loaded
    When the user enters the username and password
    And the user clicks on the login button
    Then the user verifies the homepage is loaded
    And the user performs logout