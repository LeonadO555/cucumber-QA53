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
    Then I check that count of added products on the icon card
    And  I click "Remove" button on product page
    Then I check that count of added products on the icon card is not displayed
    And I click "Back to products" button
    And I add product from Inventory page
    And  I click "Remove" button on the Inventory page
    Then I check that count of added products on the icon card is not displayed
    And I add product from Inventory page
    And I open the cart
    And I click on " Continue Shopping" button
    And I add product from Inventory page
    Then I check that products added to cart
    Then I click that products added to cart
    And  I click "Remove" button on the cart page
    And I click "Checkout" button
    Then I check that "Checkout: Your Information" opened
    And  I set up "Checkout" from
    And  I click on "Continue" button
    Then I check that "Checkout: Overview" page opened
    Then  I check that selected product correct
    And  I click on "Finish" button
    Then I check that "Checkout: Complete!" page opened
    And I click on "Back Home" button

    #Halyna Voronkova
  #Michail Gadatzki
  #Elena Militia
    # Inventory page
    # Product page

  #Irasp Andreasian
  #Natalie K
    # Cart page
    # Checkout: Your Information page

  #Aygul
  #Irina Ovsianko
    # Checkout: Overview page
    # Checkout: Complete! page