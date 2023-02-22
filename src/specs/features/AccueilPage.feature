@accueilPage
Feature: Verify that all links lead to the correct pages
  As a user
  I want to ensure all links in the Accueil page lead to the correct pages
  So that I can navigate the site effectively

  Scenario: check WHATS NEW link
    Given I am on the Accueil page
    When I click on whats new link
    Then I should be redirected to whats new page

  Scenario: check WOMEN link
    Given I am on the Accueil page
    When I click on women link
    Then I should be redirected to women page

  Scenario: check MEN link
    Given I am on the Accueil page
    When I click on men link
    Then I should be redirected to men page

  Scenario: check GEAR link
    Given I am on the Accueil page
    When I click on Gear link
    Then I should be redirected to Gear page

  Scenario: check TRAINING link
    Given I am on the Accueil page
    When I click on Training link
    Then I should be redirected to Training page

  Scenario: check SALE link
    Given I am on the Accueil page
    When I click on Sale link
    Then I should be redirected to Sale page

  Scenario: check SIGN IN link
    Given I am on the Accueil page
    When I click on Sign In link
    Then I should be redirected to Sign In page

  Scenario: check CREATE AN ACCOUNT link
    Given I am on the Accueil page
    When I click on Create an account link
    Then I should be redirected to Create an accont page

  Scenario: check CADET ICON link
    Given I am on the Accueil page
    When I click on Cadet icon link
    Then cadet content must be displayed

  Scenario: check SHOP YOGA NOW link
    Given I am on the Accueil page
    When I click on Shop Yoga Now link
    Then I should be redirected to New Yuma Yoga Collection page

  Scenario: check TWENTY PERCENT OFF link
    Given I am on the Accueil page
    When I click on Twenty Percent Off link
    Then I should be redirected to Pants Shop page

  Scenario: check SHOP TEES link
    Given I am on the Accueil page
    When I click on Shop Tees link
    Then I should be redirected to Tees Shop page

  Scenario: check SHOP ERIN RECOMMENDS link
    Given I am on the Accueil page
    When I click on Shop Erin Recommends link
    Then I should be redirected to Erin Recommends Shop page

  Scenario: check SHOP PERFORMANCE link
    Given I am on the Accueil page
    When I click on Shop Performance link
    Then I should be redirected to Performance Fabrics page

  
  Scenario: check SHOP ECO-FRIENDLY link
    Given I am on the Accueil page
    When I click on Shop EcoFriendly link
    Then I should be redirected to Eco Friendly page
