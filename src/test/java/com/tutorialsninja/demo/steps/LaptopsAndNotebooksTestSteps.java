package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTestSteps {
    @Then("I verify products are arranged in reverse order")
    public void iVerifyProductsAreArrangedInReverseOrder() {
        // Get all the products price and stored into array list
        List<Double> originalProductsPrice = new LaptopsAndNotebooksPage().getProductsPriceList();
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        // Select sort by Price (High > Low)
        new LaptopsAndNotebooksPage().selectSortByOption("Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        ArrayList<Double> afterSortByPrice =  new LaptopsAndNotebooksPage().getProductsPriceList();
        Assert.assertEquals(originalProductsPrice, afterSortByPrice, "Product not sorted by price High to Low");

    }

    @And("I select product by name {string} on laptops and notebooks page")
    public void iSelectProductByNameOnLaptopsAndNotebooksPage(String productName) {
        new LaptopsAndNotebooksPage().selectProductByName(productName);
    }

    @Then("I verify product success message")
    public void iVerifyProductSuccessMessage() {
        String expectedMessage = "Success: You have added MacBook to your shopping cart!\n" +
                "×";
        String actualMessage = new ProductPage().getProductAddedSuccessMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

   // @When("I change the quantity as {string}")
  //  public void iChangeTheQuantityAs(String String qty) {
   //     new ShoppingCartPage().changeQuantity(qty);
  //  }

    @And("I click on {string} for quantity button")
    public void iClickOnUpdateButtonForQuantityButton() {
        new ShoppingCartPage().clickOnQtyUpdateButton();
    }

    @Then("I verify the success modification message as {string}")
    public void iVerifyTheSuccessModificationMessageAs(String expectedMessage) {
        String actualMessage = new ShoppingCartPage().getSuccessModifiedMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
