package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    //    And I click on "Continue Shopping" button
    //    Then I check that products were added to cart
    //    And I click "Remove" button on the cart page
    //    And I click "Checkout"button

    public SelenideElement continueShoppingButton = $(byId("continue-shopping"));
    public SelenideElement removeButton = $(byId("remove-sauce-labs-backpack"));
    public SelenideElement checkoutButton = $(byId("checkout"));

}
