package web.todolyPages;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;
import web.controls.Toast;

public class LoginSection {
    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
    public TextBox pwdTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
    public Toast errorToast = new Toast(By.id("HeaderMessageError"));
}
