
Feature: Verify that all Gear links lead to the correct pages
  As a user
  I want to ensure all links in the Gear ption lead to the correct pages
  So that I can navigate the site effectively

  Background: 
    Given I am on the Accueil page

  Scenario: check Bags link
    When I click on Gear link
    And I click on Bags button
    Then I should be redirected to Bags page

  Scenario: check Fitness Equipment link
    When I click on Gear link
    And I click on Fitness Equipment button
    Then I should be redirected to Fitness Equipment page

  Scenario: check Watches link
    When I click on Gear link
    And I click on Watches button
    Then I should be redirected to Watches page
  Scenario: check Bags links in hidden menu
    When I click on Bags link through the hidden menu
    Then I should be redirected to Bags page

  Scenario: check Fitness Equipment links in hidden menu
    When I click on Fitness Equipment through the hidden menu
    Then I should be redirected to Fitness Equipment page

  Scenario: check Watches links in hidden menu
    When I click on Watches through the hidden menu
    Then I should be redirected to Watches page
