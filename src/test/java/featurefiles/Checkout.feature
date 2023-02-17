#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Checkout Module
 Background: Verify login is successful
  
    When The user enter the "standard_user" in username field and "secret_sauce" in password field and clicks on login button
    Then Login should be successful and user is on product page with name as "Products"

  @smoke @regression
  Scenario: Add the product and give personal info and make the payment to order the product successfully
    When Product page is displayed select the first product from the list of items
    And  click on the cart Icon
    When  Product added to cart and proceed further by clicking checkout button
    Then  In personal info page the user fills registration form with following information
    | FirstName  | LastName | Postalcode  |
    | sam        | joe      | 500015      |
    
    And   The payment page is diplayed with final cost of item click on finish button to place order  
    Then  we should get a confirmation message as "THANK YOU FOR YOUR ORDER"
  
  
  
  
  
  
  
  
