Feature: SauceDemo Products

  Scenario: Add to cart feature
  	Given I launch the browser and open the login page
    When I login using valid credentials
    Then I should land on the product page
    Given I navigate to products page
    When I click on Add to cart button
    Then Button should be changed to Remove and cart should show 1 item added

  