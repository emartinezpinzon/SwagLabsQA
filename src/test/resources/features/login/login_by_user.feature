Feature: Login to SwagLabs dashboard

  Scenario Outline: Login with valid credentials to <type> user
    Given Marianella is on login page
    When she enter "<username>" as username
    And she enter "secret_sauce" as password
    And she clicks the login button
    Then she should be able to see the "PRODUCTS"

    Examples:
      | type                | username                |
      | standard            | standard_user           |
      | problem             | problem_user            |
      | performance glitch  | performance_glitch_user |

  Scenario: Login with valid credentials to locked out user
    Given Marianella is on login page
    When she enter "locked_out_user" as username
    And she enter "secret_sauce" as password
    And she clicks the login button
    Then she will receive the error message "Epic sadface: Sorry, this user has been locked out."

  Scenario Outline: Login with invalid credentials to <type> user
    Given Marianella is on login page
    When she enter "<username>" as username
    And she enter "invalid_password" as password
    And she clicks the login button
    Then she will receive the error message "Epic sadface: Username and password do not match any user in this service"

    Examples:
      | type                | username                |
      | standard            | standard_user           |
      | locked              | locked_out_user         |
      | problem             | problem_user            |
      | performance glitch  | performance_glitch_user |