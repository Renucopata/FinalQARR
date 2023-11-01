package mobile.activities.whenDo;

import mobile.control.Button;
import mobile.control.TextBox;
import org.openqa.selenium.By;

public class AddTaskScreen {

    public TextBox titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox noteTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public Button deletebutton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));

    public Button confirmDeleteBtn = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\" and @text=\"DELETE\"]"));

}
