@creatAnCount
Feature: Create an Account
  As a user, I want to create an account on YUMA application,so that I can access personalized options and track my purchases

  Background: 
    Given I am on the Accueil page
    When I click on Create an account link

  Scenario: Create a Pass account 
    When the user enters a First Name "FnTestOne"
    And the user enters a Last Name "LnTestOne"
    And the user enters an email adress "testOk1@gmail.com"
    And the user enters a password "Test.001"
    And the user enters a confirm password "Test.001"
    And the user click on creat an account button
    Then create account should be succes and success messag should be displayed

  Scenario: Create an account with an invalid email address
    When the user enters a First Name "FnTestTwo"
    And the user enters a Last Name "LnTestTwo"
    And the user enters an  invalid email adress "testTwo@"
    And the user enters a password "Test.002"
    And the user enters a confirm password "Test.002"
    And the user click on creat an account button
    Then create account should be failed and email error mail error messag should be displayed

  Scenario: Create an account with incorrect confirm password
    When the user enters a First Name "FnTestThree"
    And the user enters a Last Name "LnTestThree"
    And the user enters an email adress "testThree@gmail.com "
    And the user enters a password "Test.003"
    And the user enters the wrong confirmation password "Test.9999"
    And the user click on creat an account button
    Then create account should be failed password error messag should be displayed

  Scenario: Create an account with used email
    When the user enters a First Name "FnTestFour"
    And the user enters a Last Name "LnTestFour"
    And the user enters an email adress "testOk@gmail.com"
    And the user enters a password "Test.004"
    And the user enters a confirm password "Test.004"
    And the user click on creat an account button
    Then create account should be failed and used email adress should be displayed
    
   Scenario: Create an account with correct password form but under eight character
    When the user enters a First Name "FnTestFive"
    And the user enters a Last Name "LnTestFive"
    And the user enters an email adress "testfive@gmail.com"
    And the user enters a password "Test.05"
    And the user enters a confirm password "Test.05"
    Then error password messag should be displayed
   
   Scenario: Create an account with empty all empty filed
    When the user enters a First Name " "
    And the user enters a Last Name ""
    And the user enters an email adress ""
    And the user enters a password ""
    And the user enters a confirm password ""
    And the user click on creat an account button
    Then create account should be failed and error message in all fields should be displayed
    
    
     Scenario: Create an Account whit signUp for Newsletter
    When the user enters a First Name "FnTestEight"
    And the user enters a Last Name "LnTestEghit"
    And the user enters an email adress "testEghit1@gmail.com"
    And the user enters a password "test.008"
    And the user enters a confirm password "test.008"
  	And click on signUp for newsletter
    And the user click on creat an account button
    Then create account should be succes and success messag should be displayed
    
    
    
    
    
    
    
    
    
    
    
    
