package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @And("I hover on the Desktops tab and click")
    public void iHoverOnTheDesktopsTabAndClick() {
        new HomePage().hoverOnDesktopsTabAndClick();
    }

    @And("call selectMenu method and pass the menu {string}")
    public void callSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().callSelectMenuMethodAndClick(menu);
    }

    @Then("I can see the text {string}")
    public void iCanSeeTheTextDesktops() {
        Assert.assertEquals(new DesktopsPage().getTextFromDesktops(), "Desktops", "Error");
    }

    @And("I hover on the Laptops & Notebooks tab and click")
    public void iHoverOnTheLaptopsNotebooksTabAndClick() {
        new HomePage().hoverOnlaptopsAndNotebooksAndClick();
    }

    @And("I hover on the Components tab and click")
    public void iHoverOnTheComponentsTabAndClick() {
        new HomePage().hoverOnComponentsAndClick();
    }
}
