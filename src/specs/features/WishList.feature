Feature: Verify that the Wish List functionality works correctly.
  As a customer,
  I want to be able to add a product in my Wish List,
  So that I can creat a Wish List

  Background: 
    Given I am on the Accueil page
    And I click on Sign In link
    And I enter my valid email "abdelhafidhwajdi@gmail.com" and password "Wajdi.17"
    And I click the Sign In button
    And I navigate to the home page

  Scenario: Add a proudct in my Wish List
    Given I put the mouse on the product to add in my Wish List
    When I click on the add to my Wish List button
    Then The product should be add to my Wish List

  Scenario: Remove a product from the wish list
    Given I put the mouse on the product to add in my Wish List
    When I click on the add to my Wish List button
    And I click on Remove This item icon button
    Then The Product should be removed from the Wish List

  Scenario: Add product to the cart from my Wish List
    Given I put the mouse on the product to add in my Wish List
    When I click on the add to my Wish List button
    And I click on Add All to cart
    Then All the products of the wish list should disappear
    And I click on the cart icon
    Then All the product must be in the cart

  Scenario: View my Wish List
    When I click on the account drop down menu
    And I click on Wish List option
    Then I should see a list of all the products in my wish list

  
  Scenario: Share my wish list with others
    Given I put the mouse on the product to add in my Wish List
    When I click on the add to my Wish List button
    And I click on Share Wish List button
    And I fill in the recipient email "test@gmail.com" address and a message "enjoy"
    And I click on share Wish List button
    Then The Wish List should be shared

  Scenario: Access to the Reorder page
    When I click on the account drop down menu
    And I click on Wish List option
    And I click on My Orders button
    Then The reorder page should be displayed
    
    
    
    
    
    
    
    
    
    
