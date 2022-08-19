Feature: Login Functionalty
  Background:
    Given Navigate to parasoft

  Scenario Outline: Login with valid username and password
    When Enter username as "<ValidUserName>" and password as "<ValidPassword>" and click login button
    Then User should login successfuly

    Examples:
      | ValidUserName | ValidPassword |
      | group6        | 123456        |

  Scenario Outline: Login with invalid username and password
    When Enter username as "<InValidUserName>" and password as "<InValidPassword>" and click login button
    Then User should login unsuccessfuly

    Examples:
      | InValidUserName | InValidPassword |
      | group6b         | 123456          |
