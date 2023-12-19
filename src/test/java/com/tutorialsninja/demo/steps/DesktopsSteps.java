package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DesktopsSteps {
    @And("click on {string}")
    public void clickOn(String showDesktop) {
        new HomePage().callSelectMenuMethodAndClick("Show AllDesktops");
    }

    @And("select sort by position {string}")
    public void selectSortByPosition(String arg0) {
        new DesktopsPage().clickOnSortByDropDown();
        new DesktopsPage().selectNameZToAFromDropdown();
    }

    @Then("I can see the products in descending order")
    public void iCanSeeTheProductsInDescendingOrder() throws InterruptedException {
        new DesktopsPage().verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }
}
