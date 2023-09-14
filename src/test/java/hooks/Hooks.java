package hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.*; //* поставили сами, чтобы импортировать все его

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("--- Before method started ---");
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*"); //связываемся с хромом и он будет брать все настройки удаленно
        open("https://www.saucedemo.com/");
        clearBrowserCookies();
        clearBrowserLocalStorage();
        System.out.println("--- Before method finished ---");
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
