Feature: Verify Checkout functionality
  As a customer,
  I want to be able to checkout and complete my purchase,
  So that I can receive the products I have ordered

  Scenario: Successful Checkout,Tabel Rate Shipping Methods
    Given I am on the Accueil page
    And I click on Shop Yoga Now link
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I click on the cart icon
    And I click on Proceed to Cheackout button
    And fill all fields with valid information
    And select Tabel Rate shipping methods and click next button
    And I click on Place Order button
    Then the order should be placed successfully

  Scenario: Successful Checkout,Fixed Shipping Methods
    Given I am on the Accueil page
    And I click on Shop Yoga Now link
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I click on the cart icon
    And I click on Proceed to Cheackout button
    And fill all fields with valid information
    And select Fixed shipping methods and click next button
    And I click on Place Order button
    Then the order should be placed successfully

  Scenario: Failed checkout, no shipping method selected
    Given I am on the Accueil page
    And I click on Shop Yoga Now link
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I click on the cart icon
    And I click on Proceed to Cheackout button
    And fill all fields with valid information
    And Click next button
    Then An error message should be displayed

  Scenario: Failed Checkout,empty informations
    Given I am on the Accueil page
    And I click on Shop Yoga Now link
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I click on the cart icon
    And I click on Proceed to Cheackout button
    And I leave all the chomps empty
    And select Fixed shipping methods and click next button
    Then the order should be failed

  Scenario: Successful Checkout after being loged
    Given I am on the Accueil page
    When I click on Sign In link
    And I enter my valid email "abdelhafidhwajdi@gmail.com" and password "Wajdi.17"
    And I click the Sign In button
    And I click on Shop Yoga Now link
    And I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I click on the cart icon
    And I click on Proceed to Cheackout button
    And select Fixed shipping methods and click next button
    And I click on Place Order button
    Then the order should be placed successfully
@test
  Scenario: Checkout after closing the browser and re-launch it
    Given I am on the Accueil page
    And I click on Shop Yoga Now link
    When I place the mouse on the product to add and i click on Add to Cart button
    And I choose the size, the color and the quantity
    And I click on Add to Cart
    And I click on the cart icon
    And I click on Proceed to Cheackout button
    And fill all fields with valid information
    And select Tabel Rate shipping methods and click next button
    And close browser and relaunch it
	  And I click on Place Order button 
    Then the order should be placed successfully
    
    
    
    
    
    
    
    
    
    
