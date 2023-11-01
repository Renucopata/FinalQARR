package web.factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Ibrowser {
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.gecko.driver","src/test/resources/firefox/geckodriver.exe");
        WebDriver firefox= new FirefoxDriver();
        return firefox;
    }
}
