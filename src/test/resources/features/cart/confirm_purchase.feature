Feature: Confirm purchase of items added to cart

  Scenario Outline: Confirm the purchase of items added to the cart by adding correct shipping information
    Given Marianella is on login page
    When she enter "<username>" as username
    And she enter "<password>" as password
    And she clicks the login button
    And she clicks on "<article>" article
    And she clicks on add to cart button
    And she clicks on cart icon
    And she clicks on checkout button
    And she enter "<first_name>" as first name
    And she enter "<last_name>" as last name
    And she enter "<postal_code>" as postal code
    And she continue to confirm purchase
    And she finish the purchase
    Then she should be able to see the "<message>"

    Examples:
      | username      | password     | article                  | first_name | last_name   | postal_code | message             |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Marianella | Jerez       | 570013      | CHECKOUT: COMPLETE! |

  Scenario Outline: Try to confirm the purchase without entering the <type_field> in the shipping information
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
      | type_field  | first_name  | last_name   | postal_code    | empty_field |
      | first name  |             | Martinez    | 570013         | First Name  |
      | last name   | Emanuel     |             | 570013         | Last Name   |
      | postal code | Emanuel     | Martinez    |                | Postal Code |
      | nothing     |             |             |                | First Name  |