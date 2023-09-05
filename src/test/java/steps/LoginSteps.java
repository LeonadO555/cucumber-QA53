package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LoginSteps {
    ChromeDriver driver;
    @Given("^I open the page Login$")
    public void iOpenThePageLogin() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",
                    "/Users/ergrevegvrg/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }
}


