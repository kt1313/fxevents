package pl.javastart.fxevents.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ContentPaneController {
    @FXML
    private TextPaneController textPaneController;

    @FXML
    private Button clearWindowButton;

    public void initialize() {
        clearWindowButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Wciśnięto przycisk");
                System.out.println(event.getEventType());
                var originalTextArea = textPaneController.getOriginalTextArea();
                var reverseTextArea=textPaneController.getReverseTextArea();
                originalTextArea.setText(" ");
                reverseTextArea.setText(" ");
            }
        });

    }
}
