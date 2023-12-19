package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNoteBooksSteps {
    @And("I click on show all laptop and notebook")
    public void iClickOnShowAllLaptopAndNotebook() {
        new HomePage().clickOnShowAllLaptopAndNoteBook();
    }

    @Then("I should see product arrange in price high to low order successfully")
    public void iShouldSeeProductArrangeInPriceHighToLowOrderSuccessfully() {
        Assert.assertEquals(new LaptopAndNotebookPage().priceHighToLow(), new LaptopAndNotebookPage().getPriceHighToLow());
    }

    @And("I select currency {string}")
    public void iSelectCurrency(String currency) {
        new HomePage().clickOnCurrency(currency);
    }

    @And("I select product {string} from laptop and notebook page")
    public void iSelectProductFromLaptopAndNotebookPage(String productName) {
        new LaptopAndNotebookPage().clickOnProductMacBook(productName);
    }

    @Then("I should navigate to {string} product")
    public void iShouldNavigateToProduct(String productName) {
        Assert.assertEquals(productName, new ProductPage().getProductMacBookText());
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("I should see product macbook added successfully message")
    public void iShouldSeeProductMacbookAddedSuccessfullyMessage() throws InterruptedException {
        Assert.assertTrue(new ProductPage().getSuccessText().contains("Success: You have added MacBook to your shopping cart!"));
    }

    @And("I click on shopping cart button")
    public void iClickOnShoppingCartButton() throws InterruptedException {
        new ProductPage().clickOnShoppingCartButton();
    }

    @Then("I should see shopping cart text")
    public void iShouldSeeShoppingCartText() {
        Assert.assertTrue(new ShoppingCartPage().getShoppingCartText().contains("Shopping Cart"));
    }

    @And("I should see {string} product")
    public void iShouldSeeProduct(String productName) {
        Assert.assertEquals("MacBook", new ShoppingCartPage().getProductText());
    }

    @And("I change quantity {string} for product")
    public void iChangeQuantityForProduct(String quantity) {
        new ShoppingCartPage().changeQuantityForProduct(quantity);
    }

    @And("I click on update quantity")
    public void iClickOnUpdateQuantity() {
        new ShoppingCartPage().clickOnUpdateQuantity();
    }

    @Then("I should see cart modified message")
    public void iShouldSeeCartModifiedMessage() {
        Assert.assertTrue(new ShoppingCartPage().getUpdateSuccessfullyText().contains("Success: You have modified your shopping cart!"));
    }

    @And("I should see total price for macbook products")
    public void iShouldSeeTotalPriceForMacbookProducts() {
        Assert.assertEquals("£737.45", new ShoppingCartPage().getTotalPrice());
    }

    @And("I click on checkout button")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @Then("I should navigate to checkout page")
    public void iShouldNavigateToCheckoutPage() {
        Assert.assertEquals("Checkout", new CheckoutPage().getCheckoutText());
    }

    @And("I should see new customer text")
    public void iShouldSeeNewCustomerText() throws InterruptedException {
        Assert.assertEquals("New Customer", new CheckoutPage().getNewCustomerText());
    }

    @And("I click on guest checkout button")
    public void iClickOnGuestCheckoutButton() throws InterruptedException {
        new CheckoutPage().clickOnGuestCheckOutRadioButton();
    }

    @And("I click on continue button of guest checkout page")
    public void iClickOnContinueButtonOfGuestCheckoutPage() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("I filled all mandatory field of checkout page")
    public void iFilledAllMandatoryFieldOfCheckoutPage() {
        new CheckoutPage().enterFirstName("Avinashsssh");
        new CheckoutPage().enterLastName("Pateelllel");
        new CheckoutPage().enterEmailId("avinahshhpaatelll@gmail.com");
        new CheckoutPage().enterTelephone("07756412596");
        new CheckoutPage().enterAddressLine1("1 Prime Road");
        new CheckoutPage().enterCity("London");
        new CheckoutPage().enterPostCode("NW1 1RF");
        new CheckoutPage().selectCountry("United Kingdom");
        new CheckoutPage().selectRegion("Aberdeen");
    }

    @And("I click on continue after fill all detail on checkout page")
    public void iClickOnContinueAfterFillAllDetailOnCheckoutPage() {
        new CheckoutPage().clickOnContinue();
    }

    @And("I add comments to text area about product order")
    public void iAddCommentsToTextAreaAboutProductOrder() {
        new CheckoutPage().addCommentsToTextArea("Thanks");
    }

    @And("I click checkbox of terms and condition")
    public void iClickCheckboxOfTermsAndCondition() throws InterruptedException {
        new CheckoutPage().checkTermsAndConditionCheckBox();
    }

    @And("I click on continue of checkout")
    public void iClickOnContinueOfCheckout() throws InterruptedException {
        new CheckoutPage().clickContinue();
    }

    @Then("I should see warning message regarding Payment method")
    public void iShouldSeeWarningMessageRegardingPaymentMethod() throws InterruptedException {
        Assert.assertTrue(new CheckoutPage().getWarningMessage());
    }
}
