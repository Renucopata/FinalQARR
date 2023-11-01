package web.controls;

import org.openqa.selenium.By;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }
    public void setText(String text){
        getControl();
        control.sendKeys(text);
    }
    public String getText(){
        getControl();
        return this.control.getAttribute("value");
    }
    public void clearSetText(String text){
        getControl();
        control.clear();
        control.sendKeys(text);
    }
}
