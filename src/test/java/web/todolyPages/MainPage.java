package web.todolyPages;

import org.openqa.selenium.By;
import web.controls.Button;

public class MainPage {

    public Button loginButton = new Button(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]"));
    public Button signupBtn = new Button(By.xpath("//div[@class='HPHeaderSignup']//a"));



}
