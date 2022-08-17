@bValidations
Feature: Basic Validations: Sign up, Sign in, Log out and Update avatar

  @bValidations_001 @logout
  Scenario: As a user, I want to update my name with a new account in Cloud App page
    Given I go to SIGN UP page
      And I signup with the following credentials:
        | Email    | userEmail+timestamp@gmail.com |
        | Password | Control123!                   |
    When Click on Sing up button
    Then The success message is displayed
    When I click on CloudApp logo
    Then The Dashboard page is displayed
    When I log out from username menu
    Then The login page is displayed
      And I login with the following credentials:
        | Email    | userEmail+timestamp@gmail.com |
        | Password | Control123!                   |
    Then The Dashboard page is displayed
    When I open settings from username menu
    Then The Setting profile page is displayed
    When I update my full name with: "Test0021"
    And I click on Submit
    Then The following message is displayed
    """
    Account updated successfully
    """




