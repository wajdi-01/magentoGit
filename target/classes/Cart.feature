Feature: Verify that the add to cart functionality works correctly for all products.
  As a customer,
  I want to ensure that I can add any product to my shopping cart,
  So that I can easily buy several items at once.

  Background: 
    Given I am on the Accueil page
    And I click on Shop Yoga Now link

  Scenario: Add a single product to the cart
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    Then the product should be added to the cart

  Scenario: Add product to cart without selecting size and color
    When I place the mouse on the product to add
    And I click on Add to Cart button
    Then Add to cart failed and error message should be displayed

  
  Scenario: Add multiple products to cart
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I navigate to the home page
    And I click on Shop Yoga Now link
    And I place the mouse on other product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    Then the tow products should be added to the cart
    
   Scenario: Delete a product from the cart
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I click on the cart icon
    And I delete the product already added
    Then The product should be deleted
    
    
    
    
    
    
    
    
    
