package web.factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements Ibrowser{
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chrome/chromedriver.exe");
        ChromeDriver chrome = new ChromeDriver();
        return chrome;
    }
}


