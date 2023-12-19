Feature: Laptops and Notebooks page
  As a user I want to check laptops and notebooks page functionality

  @sanity
  Scenario: Verify products price display high to low successfully
    Given I am on homepage
    When  I mouse hover on 'Laptops and notebooks' link and click
    And  I select menu as "Show All Laptops and notebooks" from top menu
    And  I select sort by option as "Price  (High > Low)" on desktops page
    Then I verify products are arranged in reverse order

  @smoke
  Scenario: Verify that user place order successfully
    Given   I am on homepage
    When    I mouse hover on 'Laptops and notebooks' link and click
    And     I select menu as "Show All Laptops & Notebooks" from top menu
    And     I select sort by option as "Price (High > Low)" on desktops page
    And     I select product by name "MacBook" on laptops and notebooks page
    Then    I verify product text as "MacBook"
    When    I click on 'Add to cart' button to shopping cart
    Then    I verify product success message
    When    I click on 'Shopping cart' link into message
    Then    I verify "Shopping Cart" text on cart page
    And     I verify product name as "MacBook"
    When    I change the quantity as "2"
    And     I click on 'Update button' for quantity button
    Then    I verify the success modification message as "Success: You have modified your shopping cart!"
    And     I verify price as "£737.45"



