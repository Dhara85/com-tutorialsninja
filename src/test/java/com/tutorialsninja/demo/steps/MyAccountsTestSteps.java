package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountLoginPage;
import com.tutorialsninja.demo.pages.AccountRegisterPage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountsTestSteps {
    @Then("I verify {string} text on account register page")
    public void iVerifyTextOnAccountRegisterPage(String expectedText) {
        String actualText = new AccountRegisterPage().getRegisterAccountText();
        Assert.assertEquals(actualText,expectedText);
    }

    @And("I click on {string} link")
    public void iClickOnMyAccountTabLink() {
        new AccountLoginPage().clickOnLoginButton();
    }

    @When("I select {string} option from my accounts dropdown list")
    public void iSelectOptionFromMyAccountsDropdownList(String arg0) {
    }

    @Then("I verify {string} text on account login page")
    public void iVerifyTextOnAccountLoginPage(String arg0) {
    }

    @And("I enter first name as {string}")
    public void iEnterFirstNameAs(String firstName) {
        new AccountRegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name as {string}")
    public void iEnterLastNameAs(String lastName) {
        new AccountRegisterPage().enterLastName(lastName);
    }

    @And("I enter email as {string}")
    public void iEnterEmailAs(String email) {
        new AccountRegisterPage().enterEmail(email);
    }

    @And("I enter telephone as {string}")
    public void iEnterTelephoneAs(String telephone) {
        new AccountRegisterPage().enterTelephone(telephone);
    }

    @And("I enter password as {string} on account register page")
    public void iEnterPasswordAsOnAccountRegisterPage(String password) {
        new AccountRegisterPage().enterPassword(password);
    }

    @And("I enter confirm password as {string}")
    public void iEnterConfirmPasswordAs(String confirmPassword) {
        new AccountRegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("I select subscription as {string}")
    public void iSelectSubscriptionAs(String option) {
        new AccountRegisterPage().selectSubscription(option);
    }

    @And("I click on {string} checkbox")
    public void iClickOnPrivacyPolicyCheckbox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("I click on {string} button on account register page")
    public void iClickOnContinueButtonOnAccountRegisterPage() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @Then("I verify account created text {string} on account page")
    public void iVerifyAccountCreatedTextOnAccountPage(String expectedText) {
        String actualText = new MyAccountPage().getYourAccountHasBeenCreatedText();
        Assert.assertEquals(actualText,expectedText);
    }

    @When("I click on {string} button")
    public void iClickOnContinueButton() {
        new AccountLoginPage().clickOnLoginButton();
    }

    @And("I select option from My account options as {string}")
    public void iSelectOptionFromMyAccountOptionsAs(String option) {
        new MyAccountPage().selectMyAccountOptions(option);
    }

    @Then("I verify {string} text on account page")
    public void iVerifyTextOnAccountPage(String expectedText) {
        String actualText = new MyAccountPage().getAccountLogoutText();
        Assert.assertEquals(actualText,expectedText);

    }

    @And("I enter email address as {string}")
    public void iEnterEmailAddressAs(String email) {
        new AccountLoginPage().enterEmailAddress(email);
    }

    @And("I enter password as {string}")
    public void iEnterPasswordAs(String password) {
        new AccountLoginPage().enterPassword(password);
    }
}
