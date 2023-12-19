package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on {string} link and click")
    public void iMouseHoverOnDesktopsLinkAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @Then("I verify the title as {string} on desktops page")
    public void iVerifyTheTitleAsOnDesktopsPage(String expectedTitle) {
        String actualTitle =new DesktopPage().getDesktopsText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @And("I select menu as {string} from top menu")
    public void iSelectMenuAsFromTopMenu(String menu) {
        new HomePage().selectMenu(menu);
    }

    @Then("I verify the title as {string} on laptops and notebooks page")
    public void iVerifyTheTitleAsOnLaptopsAndNotebooksPage(String expectedTitle) {
        String actualTitle =new LaptopsAndNotebooksPage().getLaptopsAndNotebooksText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("I mouse hover on {string} link and click")
    public void iMouseHoverOnComponentsLinkAndClick() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }

    @Then("I verify the title as {string} on components page")
    public void iVerifyTheTitleAsOnComponentsPage(String expectedTitle) {
        String actualTitle =new ComponentsPage().getComponentsText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
