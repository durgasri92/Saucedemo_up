$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featurefiles/Checkout.feature");
formatter.feature({
  "name": "Checkout Module",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Verify login is successful",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the \"standard_user\" in username field and \"secret_sauce\" in password field and clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsDef.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be successful and user is on product page with name as \"Products\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDef.verifyLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add the product and give personal info and make the payment to order the product successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "Product page is displayed select the first product from the list of items",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsDef.Addproduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the cart Icon",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsDef.Additemtocart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product added to cart and proceed further by clicking checkout button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsDef.Clickcheckoutbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In personal info page the user fills registration form with following information",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Postalcode"
      ]
    },
    {
      "cells": [
        "sam",
        "joe",
        "500015"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDef.personalinfo(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The payment page is diplayed with final cost of item click on finish button to place order",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsDef.CheckoutPayment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we should get a confirmation message as \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDef.verifyMsg(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/featurefiles/Login.feature");
formatter.feature({
  "name": "Login Module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify login is successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the \"standard_user\" in username field and \"secret_sauce\" in password field and clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsDef.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should be successful and user is on product page with name as \"Products\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDef.verifyLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});