package steps;

import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.InventoryPage;
import pages.LoginPage;

public class BaseSteps {
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
}