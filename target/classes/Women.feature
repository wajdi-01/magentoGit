@women
Feature: Verify Womens Menu and page fonctionality

  Background: 
    Given I am on the Accueil page
@test
  Scenario: check Jakets links in womens menu
    When I click on the link Women Jakets through the hidden menu
    Then I should be redirected to Jackets page

  Scenario: check Hoodies and Sweatshirts links in womens menu
    When I click on the link Women Hoodies and Sweatshirts through the hidden menu
    Then I should be redirected to Hoodies and Sweatshirts page

  Scenario: check Tees links in womens menu
    When I click on the link Tees through the hidden menu
    Then I should be redirected to Tees page

  Scenario: check Bras and Tanks links in womens menu
    When I click on the link Bras and Tanks through the hidden menu
    Then I should be redirected to Bras and Tanks page

  Scenario: check Pants links in womens menu
    When I click on the link Pants through the hidden menu
    Then I should be redirected to Pants page

  Scenario: check Shorts links in womens menu
    When I click on the link Shorts through the hidden menu
    Then I should be redirected to Shorts page

  Scenario: check Top link in Women page
    When I click on women link
    And I click on top button
    Then I should be redirected to Top page

  Scenario: check Bottoms link in Women page
    When I click on women link
    And I click on Bottoms button
    Then I should be redirected to Bottoms page

  Scenario: check Hoodies and SweatShirts in Women page
    When I click on women link
    And I click on Hoodies and SweatShirts button
    Then I should be redirected to Hoodies and SweatShirts page

  Scenario: check Jackets in Women page
    When I click on women link
    And I click on Jackets button
    Then I should be redirected to Jackets page

  Scenario: check Tees in Women page
    When I click on women link
    And I click on Tees button
    Then I should be redirected to Tees page

  Scenario: check Bras and Tanks in Women page
    When I click on women link
    And I click on Bras and Tanks button
    Then I should be redirected to Bras and Tanks page

  Scenario: check Pants in Women page
    When I click on women link
    And I click on Pants button
    Then I should be redirected to Pants page

  Scenario: check Shorts in Women page
    When I click on women link
    And I click on Shorts button
    Then I should be redirected to Shorts page
