package de.gfn.gui.firstapp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class HelloController {


    @FXML
    private Label ausgabe;

    @FXML
    private TextField eingabe;

    private final List<Task> tasks = new ArrayList<>();

    @FXML
    protected void save(){

        String input = eingabe.getText();
        if (input.trim().isEmpty()) return;
        Task task = new Task(input);
        tasks.add(task);
        showTask();
    }

    @FXML
    protected void clear(){
        tasks.clear();
        showTask();
    }


    @FXML
    protected void showTask() {

        StringBuilder sb = new StringBuilder();
        for (Task t: tasks){
            sb.append(t.getTitle()).append("\n");
        }

        ausgabe.setText(sb.toString());
        eingabe.setText("");
    }
}