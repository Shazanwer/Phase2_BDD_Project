Feature: This feature will be used to test the login for sauce demo application

  Background: Launch the Sauce Demo application
    Given I have launched the Sauce Demo application in the browser

  @Sanity
  Scenario Outline: Validate the positive login cases
    When I enter the username "<UserName>" and the password "<Password>"
    And I click on the Login Button
    Then I should land on the SWAG LABS page

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |

  Scenario Outline: Validate the negative login cases
    When I enter the username "<UserName1>" and the password "<Password1>"
    And I click on the Login Button
    Then I should get error message "Epic sadface: Sorry, this user has been locked out."

    Examples: 
      | UserName1       | Password1    |
      | locked_out_user | secret_sauce |
