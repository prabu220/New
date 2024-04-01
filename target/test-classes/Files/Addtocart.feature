@Smoke
Feature: to validate the add to cart button  in Overstockart application

  Scenario: to validate the add to cart button functionality
    Given user have to launch the Overstockart application in chrome browser
    When user have to enter the valid email and password
    And user have to search Traditional Art and add to cart the product
    Then to verify product is added to cart
