package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DesktopsSteps {
    @And("I click on show all desktops")
    public void iClickOnShowAllDesktops() {
        new HomePage().clickOnShowAllDesktop();
    }

    @And("I click on sort by position")
    public void iClickOnSortByPosition() {
        new DesktopPage().clickOnSortByPosition();
    }

    @And("I select product sort by {string}")
    public void iSelectProductSortBy(String text) {
        new DesktopPage().selectProductSorted(text);
    }

    @Then("I should see product arrange in alphabetical order successfully")
    public void iShouldSeeProductArrangeInAlphabeticalOrderSuccessfully() {
        Assert.assertEquals(new DesktopPage().expectedList(), new DesktopPage().getSortedProductList());
    }
}
