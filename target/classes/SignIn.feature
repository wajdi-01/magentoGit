Feature: Sign In
  	As a registered user
    I want to sign in to my account
    So that I can access my profile

  Background: 
    Given I am on the Accueil page
    When I click on Sign In link

  
  Scenario: Successful sign in
    When I enter my valid email "abdelhafidhwajdi@gmail.com" and password "Wajdi.17"
    And I click the Sign In button
    Then I should be redirected to my profile page
	
  Scenario Outline: Sign in with invalid credentials
    When I enter "<email>" and "<password>"
    And I click the Sign In button
    Then Singn In failed

    Examples: 
      | email                      | password                   |
      | abdelhafidhwajdi@gmail.com | Wajdi.71                   |
      | abdelhafidg@gmail.com      | Wajdi.17                   |
      | Wajdi.17                   | abdelhafidhwajdi@gmail.com |
      | roni_cost@example.com      | Wajdi.17                   |
   
      
	Scenario: Sign in with empty fields
	  When I leave email "" and password "" fields empty
    And I click the Sign In button
    Then login failed and error messag should be displayed
	
	
	
	
	
	
	
	
	
	
	