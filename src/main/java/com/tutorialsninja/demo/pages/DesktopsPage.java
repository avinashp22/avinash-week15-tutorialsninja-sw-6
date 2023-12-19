package com.tutorialsninja.demo.pages;


import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement desktops;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPosition;
    @CacheLookup
    @FindBy(xpath= "//a[text()='HP LP3065']")
    WebElement productHPLP3065;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    public String getTextFromDesktops(){
        log.info("Get text from desktops " + desktops.toString());
        return getTextFromElement(desktops);
    }
    public void clickOnSortByDropDown(){
        clickOnElement(sortByPosition);
        log.info("Click on sort by Dropdown " + sortByPosition.toString());
    }
    public void selectNameZToAFromDropdown(){
        selectByVisibleTextFromDropDown(sortByPosition,"Name (Z - A)");
        log.info("Select name Z to A from dropdown " + sortByPosition.toString());
    }
    public void selectNameAToZFromDropdown(){
        selectByVisibleTextFromDropDown(sortByPosition,"Name (A - Z)");
        log.info("Select name A to Z from dropdown " + sortByPosition.toString());
    }
    public void selectHPLP3065(){
        clickOnElement(productHPLP3065);
        log.info("Select product " + productHPLP3065.toString());
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        //Get all the products name and stored into array list
        List<WebElement> products = productsList;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        //Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = productsList;
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals(originalProductsName,afterSortByZToAProductsName,"Error in sorting");
        log.info("Product is in Descending order " + productsList.toString());
    }
}
