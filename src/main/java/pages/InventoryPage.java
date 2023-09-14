package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {
    public SelenideElement inventoryList = $(byClassName("inventory_list"));

//    public InventoryPage(WebDriver driver) {


//        PageFactory.initElements(driver, this);
//    }
//
//    @FindBy(className = "inventory_list")
//    public WebElement inventoryList;

}
