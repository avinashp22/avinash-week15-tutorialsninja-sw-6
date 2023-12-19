package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountsSteps {
    @And("I click on My Account link")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("call the method selectMyAccountOptions method with parameter {string}")
    public void callTheMethodSelectMyAccountOptionsMethodWithParameter(String arg0) {
        new MyAccountPage().callSelectMyAccountOptionMethod();
    }

    @And("I call the method selectMyAccountOptions method with parameter {string}")
    public void iCallTheMethodSelectMyAccountOptionsMethodWithParameter(String login) {
        new MyAccountPage().callSelectMyAccountLoginMethod();
    }

    @And("I can call the method selectMyAccountOptions method with parameter {string}")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithParameter(String myAccountOption) {
        new MyAccountPage().callSelectMyAccountOptionMethod();
    }

    @And("I enter First Name and I enter Last Name and I enter Email and I enter Telephone and I enter Password and I enter Password Confirm and I select Subscribe Yes radio button and I click on Privacy Policy check box and I click on Continue button")
    public void iEnterFirstNameAndIEnterLastNameAndIEnterEmailAndIEnterTelephoneAndIEnterPasswordAndIEnterPasswordConfirmAndISelectSubscribeYesRadioButtonAndIClickOnPrivacyPolicyCheckBoxAndIClickOnContinueButton() {
        new MyAccountPage().fillInInformation();
    }

    @Then("I can see the message {string}")
    public void iCanSeeTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountPage().getTextAccountCreated(),"Your Account Has Been Created!","Error");
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new MyAccountPage().clickOnContinueButton();
    }

    @And("I click on my Accounts Link.")
    public void iClickOnMyAccountsLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("I call the method “selectMyAccountOptions” method and pass the parameter “Logout”")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
        new MyAccountPage().callSelectMyAccountLogoutMethod();
    }

    @And("I click on the continue button")
    public void iClickOnTheContinueButton() {
        new MyAccountPage().clickOnContinueButton2();
    }

    @And("I can call the method selectMyAccountOptions method with the parameter {string}")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithTheParameter(String arg0) {
    }

    @And("I enter Email address and and I enter Password and I click on Login button")
    public void iEnterEmailAddressAndAndIEnterPasswordAndIClickOnLoginButton() {
        new MyAccountPage().callSelectMyAccountLoginMethod();
    }

    @Then("I can see the text “My Account”")
    public void iCanSeeTheTextMyAccount() {
        Assert.assertEquals(new MyAccountPage().getTextMyAccount(),"My Account","Error");
    }

    @And("I click on the My Account Link.")
    public void iClickOnTheMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink1();
    }

    @Then("I can see text “Account Logout”")
    public void iCanSeeTextAccountLogout() {
        Assert.assertEquals(new MyAccountPage().getTextAccountLogOut(),"Account Logout","Error");
    }
}
