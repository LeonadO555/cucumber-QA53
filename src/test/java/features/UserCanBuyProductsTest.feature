Feature: UserCanBuyProducts

  Background:
    Given I open the page Login

  @buy_products
  Scenario: Success login
    When I fill input user name "standard_user"
    Then I fill input password "secret_sauce"
    And I click on button Login
    Then The page Inventory is displayed
    And I open product
    Then I check that selected product opened
    And I click "Add to cart" button
    Then I check that count of added product on the icon cart changes
    And I click "Remove" button on the product page
    Then I check that count of added product on the icon cart changes
    And I click "Back to product" button
    And I add product from Inventory page
    And I click that count of added product on the icon cart is not displayed
    And I add product from Inventory page
    And I open the cart
    And click on "Continue Shopping" button
    And I add product from Inventory Page
    Then I check that products added to cart
    And I click "Remove" button on the cart page
    Then I click "Checkout: Your Information" opened
    And I set up "Checkout" form
    And I click on "Continue" button
    Then I check that "Checkout Overview" pages opened
    Then I check that selected product correct
    And I click on "Finish" button
    Then I check that "Checkout Complete" page opened
    And I click on "Back Home" button
