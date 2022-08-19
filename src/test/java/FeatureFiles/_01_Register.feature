Feature: Register Functionality

  Scenario: Register a new account

    Given Navigate to parasoft
    When Click register link
    And Enter valid user information to register form and Click register button
    Then User should be registered successfully