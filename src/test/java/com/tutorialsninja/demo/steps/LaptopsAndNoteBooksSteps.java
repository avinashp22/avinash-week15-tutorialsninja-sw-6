package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNoteBooksSteps {
    @And("I hover on Laptops & Notebooks Tab and click")
    public void iHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().hoverOnlaptopsAndNotebooksAndClick();
    }

    @And("I click on “Show All Laptops & Notebooks”")
    public void iClickOnShowAllLaptopsNotebooks() {
        new HomePage().callSelectMenuMethodAndClick("Show AllLaptops & Notebooks");
    }

    @And("I select Sort By {string}")
    public void iSelectSortBy(String arg0) {
        new LaptopsAndNotebooksPage().clickOnSortByDropDown();
        new LaptopsAndNotebooksPage().selectPriceHighToLowFromDropdown();
    }

    @Then("I can see the Product price will arrange in High to Low order.")
    public void iCanSeeTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().verifyProductsArrangedByPriceHighToLow();
    }

    @And("I select Product {string}")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().selectProductMacBook();
    }

    @And("I click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("I click on link {string} displayed into success message")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage() {
        new ProductPage().clickLinkShoppingCart();

    }

    @Then("I can able to see the text {string}")
    public void iCanAbleToSeeTheText(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextShoppingCart(),"Shopping Cart  (0.00kg)","Error");
    }

    @Then("I can able to see the Product name {string}")
    public void iCanAbleToSeeTheProductName(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextMacBook(),"MacBook","Error");
    }

    @And("I change Quantity to {int}")
    public void iChangeQuantityTo(int arg0) {
        new ShoppingCartPage().changeQuantity();
    }

    @And("I click on {string} Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateTab();
    }

    @Then("I can see the Total ${double}{double}")
    public void iCanSeeTheTotal$(int arg0, int arg1, int arg2) {
        Assert.assertEquals(new ShoppingCartPage().getTextTotal1(),"$1,204.00","Error");
    }
}
