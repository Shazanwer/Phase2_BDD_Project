$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "This feature will be used to test the login for sauce demo application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the positive login cases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I enter the username \"\u003cUserName\u003e\" and the password \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "I should land on the SWAG LABS page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.background({
  "name": "Launch the Sauce Demo application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the Sauce Demo application in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginValidation.i_have_launched_the_Sauce_Demo_application_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the positive login cases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I enter the username \"standard_user\" and the password \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginValidation.i_enter_the_username_and_the_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidation.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the SWAG LABS page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginValidation.i_should_land_on_the_SWAG_LABS_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Products.feature");
formatter.feature({
  "name": "This feature will be used to login and validate the different product prices",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Launch the Sauce Demo application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the Sauce Demo application in the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginValidation.i_have_launched_the_Sauce_Demo_application_in_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the Product and its Prices",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I enter the username \"standard_user\" and the password \"secret_sauce\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginValidation.i_enter_the_username_and_the_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidation.i_click_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am inside the Sauce Demo application on the \"PRODUCTS\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "PriceValidation.validate_pagename(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Prices of the Product",
  "rows": [
    {
      "cells": [
        "Sauce Labs Backpack",
        "$29.99"
      ]
    },
    {
      "cells": [
        "Sauce Labs Bike Light",
        "$9.99"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "PriceValidation.verify_ProductName_and_its_Price(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});