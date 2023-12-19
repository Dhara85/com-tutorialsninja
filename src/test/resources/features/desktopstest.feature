Feature:

  Scenario: Verify product arrange in alphabetical order
    Given   I am on homepage
    When    I select currency as "£Pound Sterling"
    And     I mouse hover on 'Desktops' link and click
    And     I select menu as "Show AllDesktops" from top menu
    And     I select sort by option as "Name (Z - A)" on desktops page
    Then    I verify elements are sorted in reverse order


    Scenario:Verify product added to shopping cart successFully
      Given     I am on homepage
      When      I select currency as "£Pound Sterling"
      And       I mouse hover on 'Desktops' link and click
      And       I select menu as "Show AllDesktops" from top menu
      And       I select sort by option as "Name (A - Z)" on desktops page
      And       I select product by name as "iPod Classic"
      Then      I verify product text as "iPod Classic"
      When      I select delivery date as "30","November","2023"
      And       I enter quantity as "1"
      And       I click on 'Add to cart' button to shopping cart
      Then      I verify product success message for desktop
      When      I click on 'Shopping cart' link into message
      Then      I verify "Shopping Cart" text on cart page
      And       I verify product name as "iPod Classic"
      And       I verify delivery date as "2023-11-30"
      And       I verify model as "Product 20"
      And       I verify price as "£74.73"