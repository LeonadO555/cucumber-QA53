package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement usernameInputField = $(byId("user-name"));
    public SelenideElement passwordInputField = $(byId("password"));
    public SelenideElement loginButton = $(byId("login-button"));
    public SelenideElement errorMessage = $(byId("h3"));

//    public LoginPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//    @FindBy(id = "user-name")
//    public WebElement usernameInputField;
//
//    @FindBy(id = "password")
//    public WebElement passwordInputField;
//
//    @FindBy(id = "login-button")
//    public WebElement loginButton;
//
//    @FindBy(tagName = "h3")
//    public WebElement errorMessage;

    // for cucumber-selenium


}
