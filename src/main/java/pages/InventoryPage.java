package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public SelenideElement selectedProduct = $(byId("item_4_title_link"));

    public SelenideElement addToCardButton = $(byId("add-to-cart-sauce-labs-backpack"));

    public SelenideElement removeButton = $(byXpath("//*[@data-test = 'remove-sauce-labs-backpack']"));



}
