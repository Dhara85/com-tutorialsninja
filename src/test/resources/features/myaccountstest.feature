Feature:

  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    Given   I am on homepage
    And     I click on 'MyAccountTab' link
    When    I select "Register" option from my accounts dropdown list
    Then    I verify "Register Account" text on account register page

  Scenario: verifyUserShouldNavigateToLoginPageSuccessfully
    Given   I am on homepage
    When    I click on 'MyAccountTab' link
    When    I select "Login" option from my accounts dropdown list
    Then    I verify "Returning Customer" text on account login page


  Scenario: verifyThatUserRegisterAccountSuccessfully
    Given I am on homepage
    When  I click on 'MyAccountTab'link
    And   I select "Register" option from my accounts dropdown list
    And   I enter first name as "Dhara"
    And   I enter last name as "Patel"
    And   I enter email as "automationtester@yahoo.com"
    And   I enter telephone as "07540152356"
    And   I enter password as "autotester432" on account register page
    And   I enter confirm password as "autotester432"
    And   I select subscription as "Yes"
    And   I click on 'Privacy Policy' checkbox
    And   I click on 'Continue' button on account register page
    Then  I verify account created text "Your Account Has Been Created!" on account page
    When  I click on 'Continue' button
    And   I click on 'MyAccountTab' link
    And   I select option from My account options as "Logout"
    Then  I verify "Account Logout" text on account page
    And   I click on 'Continue' button


  Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
    Given I am on homepage
    When  I click on 'MyAccountTab'link
    And   I select "Login" option from my accounts dropdown list
    And   I enter email address as "automationtester@yahoo.com"
    And   I enter password as "autotester432"
    And   I click on 'Login' button
    And   I click on 'My AccountTab' link
    And   I select option from My account options as "Logout"
    Then  I verify "Account Logout" text on account page