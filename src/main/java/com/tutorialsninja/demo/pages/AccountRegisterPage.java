package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountRegisterPage  extends Utility {
    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passwordConfirmField;

    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    List<WebElement> subscribeRadios;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;




    public String getRegisterAccountText() {
        log.info("Getting register account text : " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstNameField, fName);
        log.info("Entering first name : " + firstNameField.toString());

    }

    public void enterLastName(String lName) {
        sendTextToElement(lastNameField, lName);
        log.info("Entering last name : " + lastNameField.toString());

    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Entering email : " + emailField.toString());

    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
        log.info("Entering telephone : " + telephoneField.toString());

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + passwordField.toString());

    }

    public void enterConfirmPassword(String cPassword) {
        sendTextToElement(passwordConfirmField, cPassword);
        log.info("Entering confirm password : " + passwordConfirmField.toString());

    }

    public void selectSubscription(String option) {
        List<WebElement> radioButtons = subscribeRadios;
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
        log.info("Selecting subscription : " + subscribeRadios.toString());

    }


    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyPolicyCheckBox);
        log.info("Clicking privacy policy checkbox : " + privacyPolicyCheckBox.toString());

    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        log.info("Clicking on continue button : " + continueBtn.toString());

    }

}
