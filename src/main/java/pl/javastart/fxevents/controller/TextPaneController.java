package pl.javastart.fxevents.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class TextPaneController {

    @FXML
    private TextArea originalTextArea;

    @FXML
    private TextArea reverseTextArea;

    public TextArea getOriginalTextArea() {
        return originalTextArea;
    }

    public TextArea getReverseTextArea() {
        return reverseTextArea;
    }
    public void initialize() {
        originalTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
                x -> reverseTextHandler(originalTextArea, reverseTextArea)
        );
        reverseTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
                x -> reverseTextHandler(reverseTextArea, originalTextArea)
        );
    }

    private void reverseTextHandler(TextArea source, TextArea target) {
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }
    /*
    originalTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x ->
    {
        System.out.println("Wciśnięto przycisk");
        String textIn = inputTextArea.getText();
        String textReverse = new StringBuilder().append(textIn).reverse().toString();
        System.out.println(textReverse);
        outputTextArea.setText(textReverse);
    });*/
}
