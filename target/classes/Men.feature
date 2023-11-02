@men 
Feature: Verify Men Menu and page fonctionality
  As a user
  I want to ensure all links in the Accueil page lead to the correct pages
  So that I can navigate the site effectively

  Background: 
    Given I am on the Accueil page

  Scenario: check Jakets links in Men menu
    When I click on the link Men Jakets through the hidden menu
    Then I should be redirected to Men Jackets page

  Scenario: check Hoodies and Sweatshirts links in Men menu
    When I click on the link Men Hoodies and Sweatshirts through the hidden menu
    Then I should be redirected to Men Hoodies and Sweatshirts page

  Scenario: check Tees links in Men menu
    When I click on the link Men Tees through the hidden menu
    Then I should be redirected to Men Tees page

  Scenario: check Tanks links in Men menu
    When I click on the link Men Tanks through the hidden menu
    Then I should be redirected Men Tanks page

  Scenario: check Pants links in Men menu
    When I click on the link Men Pants through the hidden menu
    Then I should be redirected to Men Pants page

  Scenario: check Shorts links in Men menu
    When I click on the link Men Shorts through the hidden menu
    Then I should be redirected to Men Shorts page

  Scenario: check Top link in Men page
    When I click on Men link
    And I click on Men top button
    Then I should be redirected to Men Top page

  Scenario: check Bottoms link in Men page
    When I click on Men link
    And I click on Men  Bottoms button
    Then I should be redirected to Men Bottoms page

  Scenario: check Hoodies and SweatShirts in Men page
    When I click on Men link
    And I click on Men Hoodies and SweatShirts button
    Then I should be redirected to Men Hoodies and SweatShirts page

  Scenario: check Jackets in Men page
    When I click on Men link
    And I click on Men Jackets button
    Then I should be redirected to Men Jackets page
 
  Scenario: check Tees in Men page
    When I click on Men link
    And I click on Men Tees button
    Then I should be redirected to Men Tees page
 
  Scenario: check Tanks in Men page
    When I click on Men link
    And I click on Men Tanks button
    Then I should be redirected Men Tanks page
 
  Scenario: check Pants in Men page
    When I click on Men link
    And I click on Men Pants button
    Then I should be redirected to Men Pants page
 
  Scenario: check Shorts in Men page
    When I click on Men link
    And I click on Men Shorts button
    Then I should be redirected to Men Shorts page
