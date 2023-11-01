package mobile.testSuite;

import mobile.activities.whenDo.AddTaskScreen;
import mobile.activities.whenDo.MyListScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class WhenDoTest {

    String TASK_NAME = "TaskFinalRenuco" + new Date().getTime();
    String TASK_UPDATED = "TaskFinalRenucoUpdated" + new Date().getTime();
    String NOTE_CONTENT = "Voy por el 120 profe!!!";

    public AddTaskScreen addTaskScreen = new AddTaskScreen();
    public MyListScreen myListScreen = new MyListScreen();

    @Test
    public void createUpdateDeleteTask(){

        //Create task
        myListScreen.addButton.click();
        addTaskScreen.titleTextBox.setText(TASK_NAME);
        addTaskScreen.noteTextBox.setText(NOTE_CONTENT);
        addTaskScreen.saveButton.click();
        Assertions.assertTrue(myListScreen.getSpecificTask(TASK_NAME).isControlDisplayed());

        //Update task
        myListScreen.getSpecificTask(TASK_NAME).click();
        addTaskScreen.titleTextBox.setText(TASK_UPDATED);
        addTaskScreen.saveButton.click();
        Assertions.assertTrue(myListScreen.getSpecificTask(TASK_UPDATED).isControlDisplayed(), "Error al actualizar la nota");


        //Delete task
        myListScreen.getSpecificTask(TASK_UPDATED).click();
        addTaskScreen.deletebutton.click();
        addTaskScreen.confirmDeleteBtn.click();
        Assertions.assertFalse(myListScreen.getSpecificTask(TASK_UPDATED).isControlDisplayed(),"No se elimino correctamente");

    }

}
