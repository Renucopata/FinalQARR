package web.todolyPages;

import org.openqa.selenium.By;
import web.controls.Button;
import web.controls.TextBox;
public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"));
    public Button addNewProjectBtn = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox projectNameTb = new TextBox(By.id("NewProjNameInput"));
    public Button addProjectBtn = new Button(By.id("NewProjNameButton"));
    public TextBox addItemTb = new TextBox(By.id("NewItemContentInput"));
    public Button addItemBtn = new Button(By.id("NewItemAddButton"));
    public Button settingsBtn = new Button(By.xpath("//a[text()='Settings']"));


    public Button newestProject(String projectName){
        return new Button(By.xpath("//ul[@id='mainProjectList']//li//td[text()='"+projectName+"']"));
    }

    public Button newestItem(String item){
        return new Button(By.xpath("//div[@class='ItemContentDiv' and text()='"+item+"']"));
    }
    public Button selectProjectButton(String projectName){
        return new Button(By.xpath("//td[text()='"+projectName+"']"));
    }
    public TextBox newItemTb(){
        return new TextBox(By.xpath("//div[@class='ItemContentDiv UnderEditingItem']//div[@id='ItemEditDiv']//textarea[@id='ItemEditTextbox']"));
    }

}
