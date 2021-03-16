@Login
Feature:OrangeHRM Login

  Scenario: Valid Login
    Given User on the login page
    When User enter correct username in the username field
    And User enter correct password in the password field
    And User click on the login button
    Then User see the home page

    Scenario: Invalid Login
      Given User on the login page
      When User enter incorrect username in the username field
      And User enter incorrect password in the password field
      And User click on the login button
      Then User see the error message on the login page