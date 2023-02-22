Feature: Verify that the sorting options for products are working correctly
  As a user, 
  I want to verify that the sorting options for products are working correctly,
  so that I can find the products that I am looking for in an efficient and accurate manner

  Background: 
    Given I am on the Accueil page

  Scenario: Sorting with price range
    When I click on women link
    And I click on Hoodies and SweatShirts button
    And I click on Price dropdown menu and select the price range
    Then The result of the search must respect the price range

  Scenario: Sorting with Size
    When I click on Men link
    And I click on Men Jackets button
    And I click on Size dropdown menu and select the Size
    Then The result of the search must respect the Size

  Scenario: Sorting with Color
    When I click on women link
    And I click on Bras and Tanks button
    And I click on Color dropdown menu and select the Color
    Then The result of the search must respect the Color selected

  Scenario: Sorting by price organization,least expensive to the most expensive
    When I click on Gear link
    And I click on Bags button
    And I select the price option from the dropdown menu
    Then The search result must be displayed from the least expensive to the most expensive

  Scenario: Sorting by Product Name organization
    When I click on Gear link
    And I click on Bags button
    And I select product name from the dropdown menu
    Then the result should be displayed in alphabetical order

  
  Scenario: Sorting by price organization,most expensive to least expensive
    When I click on Gear link
    And I click on Bags button
    And I select the price option from the dropdown menu
    And I click on Sort By arrow
    Then The search result must be displayed from most expensive to least expensive

  Scenario: Sorting by product name reverse organization
    When I click on Gear link
    And I click on Bags button
    And I select product name from the dropdown menu
    And I click on Sort By arrow
    Then the result should be displayed in reverse alphabetical order
