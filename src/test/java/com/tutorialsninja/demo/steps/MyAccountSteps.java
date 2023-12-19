package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LoginPage;
import com.tutorialsninja.demo.pages.LogoutPage;
import com.tutorialsninja.demo.pages.RegisterPage;
import com.tutorialsninja.demo.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountSteps {
    @When("I click on my account link")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyAccountLink();
    }

    @And("I select {string} option from my account options")
    public void iSelectOptionFromMyAccountOptions(String option) {
        new HomePage().selectMyAccountOptions(option);
    }

    @Then("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals("Register Account", new RegisterPage().getRegisterText());
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals("Returning Customer", new LoginPage().getReturningCustomerTextFromLoginPage());
    }

    @And("I filled all mandatory field of registration")
    public void iFilledAllMandatoryFieldOfRegistration() {
        new RegisterPage().enterFirstName("Avvinashhh");
        new RegisterPage().enterLastName("Paaaateeellll");
        new RegisterPage().enterEmail("Aviiinnnaashss" + new Utility().getRandomString(4) + "@gmail.com");
        new RegisterPage().enterTelephone("07765896541");
        new RegisterPage().enterPassword("Prime12345");
        new RegisterPage().enterConfirmPassword("Prime12345");
        new RegisterPage().clickOnSubscribeRadioButton("Yes");
        new RegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("I click on continue button of registration page")
    public void iClickOnContinueButtonOfRegistrationPage() throws InterruptedException {
        new RegisterPage().clickOnContinueButton();
    }

    @Then("I should see account successfully created message")
    public void iShouldSeeAccountSuccessfullyCreatedMessage() {
        Assert.assertEquals("Your Account Has Been Created!", new RegisterPage().getAccountCreatedMessage());
    }

    @And("I click on continue")
    public void iClickOnContinue() {
        new RegisterPage().clickOnContinue();
    }

    @Then("I should logout successfully")
    public void iShouldLogoutSuccessfully() {
        Assert.assertEquals("Account Logout", new LogoutPage().getAccountLogoutText());
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new LogoutPage().clickOnContinueButton();
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
        Assert.assertEquals("My Account", new LoginPage().getMyAccountText());
    }
}
