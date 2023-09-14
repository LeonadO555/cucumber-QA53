package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.InventoryPage;

public class InventorySteps extends BaseSteps {
    @And("^I open product$")
            public void openProducts(){
        inventoryPage.selectProduct.click();
            }

    @Then("^I check that selected product opened$")
    public void iCheckThatSelectedProductOpened() {

    }
}
