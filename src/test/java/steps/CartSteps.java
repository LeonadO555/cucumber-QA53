package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CartSteps extends BaseSteps {


    @And("^I click on \"([^\"]*)\" button$")
    public void iClickContinueShoppingButton(String arg0) {
        //cartSteps.iClickContinueShoppingButton;
    }

    @Then("^I check that products were added to card$")
    public void iCheckThatProductsWereAddedToCard() {

    }

    @And("^I click \"([^\"]*)\" button on the card page$")
    public void iClickButtonOnTheCardPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click \"([^\"]*)\" button$")
    public void iClickButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();

    }
}
