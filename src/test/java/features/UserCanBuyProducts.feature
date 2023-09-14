Feature: UserCanBuyProducts.feature
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
    Then I check count of added products on the icon card changed
    And  I click "Remove" button on product page
    And  I click "Back to products" button
    And I add product free Inventory page
    And I click "Back to products" button
    And  I click "Remove" button on the Inventory page
    Then I check that count of added products on the icon card is not displayed
    And I add product free Inventory page
    Then I open the cart
    Then I check that products were added to cart
    And I click "Remove" button on the cart page

