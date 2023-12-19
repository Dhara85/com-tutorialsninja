Feature:Top menu Test
  As a user I want to check Top menu functionality

  @smoke
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on homepage
    When I mouse hover on 'Desktops' link and click
    And  I select menu as "Show AllDesktops"  from top menu
    Then  I verify the title as "Desktops" on desktops page


    Scenario: Verify user should navigate to Laptops and notebooks page successfully
      Given I am on homepage
      When I mouse hover on 'Laptops and notebooks' link and click
      And I select menu as "Show All laptops & Notebooks" from top menu
      Then I verify the title as "Laptops & Notebooks" on laptops and notebooks page


      Scenario: Verify user should navigate to components page successfully
        Given I am on homepage
        When I mouse hover on 'Components' link and click
        And I select menu as "Show All Components" from top menu
        Then I verify the title as "Components" on components page
