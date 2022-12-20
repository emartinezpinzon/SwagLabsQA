Feature: Add article to cart

  Scenario: Add article Sauce Labs Fleece Jacket to cart
    Given Marianella is on login page
    When she enter "standard_user" as username
    And she enter "secret_sauce" as password
    And she clicks the login button
    And she clicks on "Sauce Labs Fleece Jacket" article
    And she clicks on add to cart button
    And she clicks on cart icon
    Then she should be to see her cart
    And she should be to see "Sauce Labs Fleece Jacket" article
