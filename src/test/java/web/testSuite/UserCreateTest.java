package web.testSuite;


import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserCreateTest extends TestBase {

    String randomEmail = "renuco" + new Date().getTime() + "@gmail.com";
    String randomPassword = "12345" + new Date().getTime();

    @Test
    public void createLoginCreateFailTest() throws InterruptedException{
        mainPage.signupBtn.click();

        signupPopup.nameTb.setText("Renuco");
        signupPopup.emailTb.setText(randomEmail);
        signupPopup.pwTb.setText(randomPassword);

        signupPopup.termCb.click();
        signupPopup.signupBtn.click();
        Thread.sleep(2000);
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "Error: No se pudo crear la cuenta");



        menuSection.logoutButton.click();
        loginCreateUser();
        createUserSameCredentials();
    }

    public void loginCreateUser(){
        mainPage.loginButton.click();
        loginSection.emailTextBox.setText(randomEmail);
        loginSection.pwdTextBox.setText(randomPassword);
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo iniciar sesion");
        menuSection.logoutButton.click();

    }

    private void createUserSameCredentials() {
        mainPage.signupBtn.click();

        signupPopup.nameTb.setText("Renuco");
        signupPopup.emailTb.setText(randomEmail);
        signupPopup.pwTb.setText(randomPassword);

        signupPopup.termCb.click();
        signupPopup.signupBtn.click();

        Assertions.assertFalse(menuSection.logoutButton.isControlDisplayed(),
                "Error");
    }
}
