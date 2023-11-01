package web.todolyPages;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;

public class SettingsPage {
    public TextBox fullNameInput = new TextBox(By.id("FullNameInput"));
    public Button accountStgsBtn = new Button(By.xpath("//a[text()='Account']"));
    public Button deleteAccountBtn = new Button(By.id("DeleteAccountBtn"));
    //despues un enter
    public Button okButton = new Button(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"));
}