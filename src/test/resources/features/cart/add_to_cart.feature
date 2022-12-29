Feature: Add article to cart

  Scenario Outline: Add article to cart
    Given Marianella is on login page
    When she enter "<username>" as username
    And she enter "<password>" as password
    And she clicks the login button
    And she clicks on "<article>" article
    And she clicks on add to cart button
    And she clicks on cart icon
    Then she should be to see her cart
    And she should be to see "<article>" article

    Examples:
      | username      | password     | article                  |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket |