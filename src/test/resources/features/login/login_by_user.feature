Feature: Login to SwagLabs dashboard
  Scenario: Login with valid credentials to standard user
    Given Marianella is on login page
    When she enter "standard_user" as username
    And she enter "secret_sauce" as password
    And she clicks the login button
    Then she should be able to see the "PRODUCTS"