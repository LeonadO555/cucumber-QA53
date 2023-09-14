Feature: UserCanBuyThings

  Background:
    Given I open the page Login

  @Buy_products
  Scenario: Success login
    When I fill input user name "standard_user"
    Then I fill input password "secret_sauce"
    And I click on button Login
    Then The page Inventory is displayed
    And I open product
    Then I check that selected product opened
    And I click "Add to card" button
    Then I check that count of added products on the icon card changed
    And I click "Remove" button on the product page
    Then I check that count of added products on the icon card displayed
    And I click "Back to products" button
    And I click "Add to card" button
    And I click "Back to products" button
    And I add product from Inventory page
    Then I check that count of added products on the icon card displayed
    And I add product from Inventory page
    Then I open the card
    And I click on "Continue Shopping" button
    Then I check that products were added to card
    And I click "Remove" button on the card page
    And I click "Checkout" button
    Then I check that "Checkout: Your Information" opened
    And I set up "Checkout" form
    And I click on "Continue" button
    Then I check that "Checkout: Overview" page opened
    Then I check that selected product correct
    And I click on "Finish" button
    Then I check that "Checkout: Complete!" page opened
    And I click on "Back Home" button

  # Card page
  #Checkout: Your Information page
