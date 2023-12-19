Feature: Accounts Tests

  Background: I am on homepage

  @sanity @smoke @regression
  Scenario: User should navigate to register page successfully
    When I click on my account link
    And I select "Register" option from my account options
    Then I should navigate to register page successfully

  @regression
  Scenario: User should navigate to login page successfully
    When I click on my account link
    And I select "Login" option from my account options
    Then I should navigate to login page successfully

  @sanity @regression
  Scenario: User should register account successfully
    When I click on my account link
    And I select "Register" option from my account options
    And I filled all mandatory field of registration
    And I click on continue button of registration page
    Then I should see account successfully created message
    And I click on continue
    And I click on my account link
    And I select "Logout" option from my account options
    Then I should logout successfully
    And I click on continue button

  @sanity @regression
  Scenario: User should login and logout successfully
    When I click on my account link
    And I select "Login" option from my account options
    And I enter email "avinashp22@gmail.com"
    And I enter password "Prime12345"
    And I click on login button
    Then I should login successfully
    And I click on my account link
    And I select "Logout" option from my account options
    Then I should logout successfully
    And I click on continue button