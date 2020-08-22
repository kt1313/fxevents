module fxaction {
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.javastart.fxevents.main;
    opens pl.javastart.fxevents.controller to javafx.fxml;
}