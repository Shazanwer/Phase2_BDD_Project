Feature: This feature will be used to login and validate the different product prices

  Background: Launch the Sauce Demo application
    Given I have launched the Sauce Demo application in the browser

  @Regression
  Scenario: Validate the Product and its Prices
    When I enter the username "standard_user" and the password "secret_sauce"
    And I click on the Login Button
    Then I am inside the Sauce Demo application on the "PRODUCTS" page
    Then Validate the Prices of the Product
      | Sauce Labs Backpack   | $29.99 |
      | Sauce Labs Bike Light | $9.99  |
