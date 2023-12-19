package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;



    public String getShoppingCartText() {
        log.info("Getting shopping cart text : " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        log.info("Getting product name : " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getDeliveryDate() {
        log.info("Getting delivery date : " + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public String getModel() {
        log.info("Getting model : " + model.toString());
        return getTextFromElement(model);
    }

    public String getTotal() {
        log.info("Getting total : " + total.toString());
        return getTextFromElement(total);
    }

  //  public void changeQuantity(String qty) {
   //     clearTextField(qtyField);
   //     sendTextToElement(qtyField, qty);
   //     log.info("Changing quantity : " + qtyField.toString());

  //  }

    public void clickOnQtyUpdateButton() {
        clickOnElement(qtyUpdateBtn);
        log.info("Clicking on quantity update button : " + qtyUpdateBtn.toString());

    }

    public String getSuccessModifiedMessage() {
        log.info("Getting success modified message : " + successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }

}
