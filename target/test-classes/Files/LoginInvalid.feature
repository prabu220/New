@Sanity
Feature: to validate the sign in functionality in Overstockart application

  Scenario Outline: 
      to validate the login with invalid user name and invalid password

    Given user have to launch the Overstockart application in chrome browser
    When user have to enter the invalid "<email>" and "<password>"
    And user have to click the sign in button
    Then to verify sign in is completed

    Examples: 
      | email                  | password     |
      | prabucivil@gmail.com   | 12109780     |
      | Prabu220@gmail.com     | Prabu123     |
      | framework123@gmail.com | framework123 |
      | cucumber456@gmail.com  | cucumber123  |
