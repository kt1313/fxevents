package pl.javastart.fxevents.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class ContentPaneController {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    @FXML
    private Button clearWindowButton;

    public void initialize() {
        clearWindowButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Wciśnięto przycisk");
                System.out.println(event.getEventType());
                inputTextArea.setText(" ");
                outputTextArea.setText(" ");
            }
        });
            inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x ->
            {
                System.out.println("Wciśnięto przycisk");
                String textIn = inputTextArea.getText();
                String textReverse = new StringBuilder().append(textIn).reverse().toString();
                System.out.println(textReverse);
                outputTextArea.setText(textReverse);
            });

    }
}

