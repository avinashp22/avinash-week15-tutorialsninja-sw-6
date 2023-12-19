Feature: Laptops and Notebook page test cases


  Scenario: Verify that products price display High To Low successfully
    Given I am on the homepage
    And I hover on Laptops & Notebooks Tab and click
    And I click on “Show All Laptops & Notebooks”
    And I select Sort By "Price (High > Low)"
    Then I can see the Product price will arrange in High to Low order.


  Scenario: Verify that user place order successfully
    Given I am on the homepage
    And I hover on Laptops & Notebooks Tab and click
    And I click on “Show All Laptops & Notebooks”
    And I select Sort By "Price (High > Low)"
    And I select Product "MacBook"
    Then I can see the text "MacBook"
    And I click on ‘Add To Cart’ button
    Then I can see the message 'Success: You have added MacBook to your shopping cart!'
    And I click on link 'shopping cart' displayed into success message
    Then I can able to see the text "Shopping Cart"
    Then I can able to see the Product name "MacBook"
    And I change Quantity to 2
    And I click on 'Update' Tab
    Then I can see the message 'Success: You have modified your shopping cart!'
    Then I can see the Total $1,204.00