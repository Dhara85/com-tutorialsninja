package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsPageTestSteps {
    @When("I select currency as {string}")
    public void iSelectCurrencyAs(String currency) {
        new HomePage().selectCurrency(currency);
    }

    @And("I select sort by option as {string} on desktops page")
    public void iSelectSortByOptionAsOnDesktopsPage(String option) {
        new DesktopPage().selectSortByOption(option);
    }

    @Then("I verify elements are sorted in reverse order")
    public void iVerifyElementsAreSortedInReverseOrder() {
        new DesktopPage().verifySortedElementsInReverseOrder();
    }

    @And("I select product by name as {string}")
    public void iSelectProductByNameAs(String productName) {
        new DesktopPage().selectProductByName(productName);
    }

    @Then("I verify product text as {string}")
    public void iVerifyProductTextAs(String expectedProductName) {
        String actualProductName = new ProductPage().getProductText();
        Assert.assertEquals(actualProductName,expectedProductName);
    }

    @When("I select delivery date as {string},{string},{string}")
    public void iSelectDeliveryDateAs(String date, String month, String year) {
        new ProductPage().selectDeliveryDate(date,month,year);
    }

    @And("I enter quantity as {string}")
    public void iEnterQuantityAs(String qty) {
        new ProductPage().equals(qty);
    }

    @And("I click on {string} button to shopping cart")
    public void iClickOnAddToCartButtonToShoppingCart() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("I verify product success message for desktop")
    public void iVerifyProductSuccessMessageForDesktop() {
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        String actualMessage =new ProductPage().getProductAddedSuccessMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @When("I click on {string} link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("I verify {string} text on cart page")
    public void iVerifyTextOnCartPage(String expectedText) {
        String actualText = new ShoppingCartPage().getShoppingCartText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @And("I verify product name as {string}")
    public void iVerifyProductNameAs(String expectedProductName) {
        String actualProductName = new ShoppingCartPage().getProductName();
        Assert.assertEquals(actualProductName,expectedProductName);
    }

    @And("I verify delivery date as {string}")
    public void iVerifyDeliveryDateAs(String expectedDeliveryDate) {
        String actualDeliveryDate = new ShoppingCartPage().getDeliveryDate();
        Assert.assertTrue(actualDeliveryDate.contains(expectedDeliveryDate));
    }

    @And("I verify model as {string}")
    public void iVerifyModelAs(String expectedModel) {
        String actualModel = new ShoppingCartPage().getModel();
        Assert.assertEquals(actualModel,expectedModel);
    }

    @And("I verify price as {string}")
    public void iVerifyPriceAs(String expectedPrice) {
        String actualPrice =  new ShoppingCartPage().getTotal();
        Assert.assertEquals(actualPrice,expectedPrice);
    }
}
