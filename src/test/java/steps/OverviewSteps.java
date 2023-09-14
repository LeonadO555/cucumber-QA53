package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static com.codeborne.selenide.Condition.visible;

public class OverviewSteps extends BaseSteps{
    @Then("^I check that \"([^\"]*)\" pages opened$")
    public void iCheckThatPagesOpened() {
        checkoutOverviewPage.titlePage.shouldBe(visible);
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton() {
        checkoutOverviewPage.finishButton.click();
    }
}
