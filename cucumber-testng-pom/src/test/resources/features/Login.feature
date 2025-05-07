Feature: SauceDemo Login

  Scenario: Valid Login
    Given I launch the browser and open the login page
    When I login using valid credentials
    Then I should land on the product page

  