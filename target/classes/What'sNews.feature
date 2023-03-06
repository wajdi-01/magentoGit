@whatsNews
Feature: Verify Whats News Page
  I want to ensure all links in the Whats New page ead to the correct pages
  

  Scenario: Verify New in Womens category
    Given I am on the Accueil page
    When I click on whats new link
    Then I click on each womens category one by one and I should be directed to the right page
	
  Scenario: Verify New in Mens category
    Given I am on the Accueil page
    When I click on whats new link
    Then I click on each mens category one by one and I should be directed to the right page
