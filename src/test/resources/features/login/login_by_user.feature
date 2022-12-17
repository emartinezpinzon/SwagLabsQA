Feature: Login to SwagLabs dashboard
  Scenario: Login with valid credentials to standard user
    Given user is on login page
    When user enter standard_user as username
    And user enter secret_sauce as password
    Then user should be able to login