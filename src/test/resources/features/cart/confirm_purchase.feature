Feature: Confirm purchase of items added to cart

  Scenario: Confirm the purchase of items added to the cart by adding correct shipping information
    Given Marianella is on login page
    When she enter "standard_user" as username
    And she enter "secret_sauce" as password
    And she clicks the login button
    And she clicks on "Sauce Labs Fleece Jacket" article
    And she clicks on add to cart button
    And she clicks on cart icon
    And she clicks on checkout button
    And she enter "Marianella" as first name
    And she enter "Jerez" as last name
    And she enter "570013" as postal code
    And she continue to confirm purchase
    And she finish the purchase
    Then she should be able to see the "CHECKOUT: COMPLETE!"

  Scenario Outline: Try to confirm the purchase without entering the <empty_field> in the shipping information
    Given Marianella is on login page
    When she enter "standard_user" as username
    And she enter "secret_sauce" as password
    And she clicks the login button
    And she clicks on "Sauce Labs Fleece Jacket" article
    And she clicks on add to cart button
    And she clicks on cart icon
    And she clicks on checkout button
    And she enter "<first_name>" as first name
    And she enter "<last_name>" as last name
    And she enter "<postal_code>" as postal code
    And she continue to confirm purchase
    Then she will receive the error message "Error: <empty_field> is required"

    Examples:
      | empty_field | first_name  | last_name   | postal_code    |
      | first name  |             | Martinez    | 570013         |
      | last name   | Emanuel     |             | 570013         |
      | postal code | Emanuel     | Martinez    |                |