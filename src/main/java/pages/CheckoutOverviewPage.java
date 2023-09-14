package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage {
    public SelenideElement titlePage = $(byClassName("title"));
    public SelenideElement finishButton = $(byId("finish"));
}
