package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps extends BaseSteps{

        @When("^I fill input user name \"([^\"]*)\"$")
    public void iFillInputUserName(String usernameValue) {
    loginPage.usernameInputField.setValue(usernameValue);
    }

    @Then("^I fill input password \"([^\"]*)\"$")
    public void iFillInputPassword(String passwordValue) {
        loginPage.passwordInputField.setValue(passwordValue);
    }

    @And("^I click on button Login$")
    public void iClickOnButtonLogin() {
        loginPage.loginButton.click();
    }

    @Then("^The page Inventory is displayed$")
    public void thePageInventoryIsDisplayed() {
        inventoryPage.inventoryList.shouldBe(visible);
    }
    @Then("^error message with text \"([^\"]*)\" is displayed$")
    public void errorMessageWithTextIsDisplayed(String expectedText) {
        loginPage.errorMessage.shouldHave(text(expectedText));
    }

}


