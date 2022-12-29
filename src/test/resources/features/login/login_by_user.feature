Feature: Login to SwagLabs dashboard

  Scenario Outline: Login with valid credentials to <type> user
    Given Marianella is on login page
    When she enter "<username>" as username
    And she enter "secret_sauce" as password
    And she clicks the login button
    Then she should be able to see the "<message>"

    Examples:
      | type                | username                | message   |
      | standard            | standard_user           | PRODUCTS  |
      | problem             | problem_user            | PRODUCTS  |
      | performance glitch  | performance_glitch_user | PRODUCTS  |

  Scenario Outline: Login with invalid credentials to <type> user
    Given Marianella is on login page
    When she enter "<username>" as username
    And she enter "<password>" as password
    And she clicks the login button
    Then she will receive the error message "<message>"

    Examples:
      | type                | username                | password         | message                                                                   |
      | standard            | standard_user           | invalid_password | Epic sadface: Username and password do not match any user in this service |
      | locked              | locked_out_user         | invalid_password | Epic sadface: Username and password do not match any user in this service |
      | problem             | problem_user            | invalid_password | Epic sadface: Username and password do not match any user in this service |
      | performance glitch  | performance_glitch_user | invalid_password | Epic sadface: Username and password do not match any user in this service |
      | locked out user     | locked_out_user         | secret_sauce     | Epic sadface: Sorry, this user has been locked out.                       |