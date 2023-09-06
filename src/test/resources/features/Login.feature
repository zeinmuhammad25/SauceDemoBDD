@Login
Feature: Login
  As a user i want login to website sauce demo

  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" as a userName "secret_sauce" as a password
    Then User already on home page

  @Invalid
  Scenario Outline: Invalid login
    Given User open the website sauce demo
    When User input "<userName>" as a userName "<password>" as a password
    Then User see error "<errorText>" on login page
 Examples:
   | userName      | password     | errorText                                                                 |
   |               | secret_sauce | Epic sadface: Username is required                                        |
   | standard_user |              | Epic sadface: Password is required                                        |
   | alfian        | 123          | Epic sadface: Username and password do not match any user in this service |
