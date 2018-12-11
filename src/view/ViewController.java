package view;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ViewController {
    public Label welcomeAK;

    public void sayWelcome(ActionEvent actionEvent) {
        welcomeAK.setText("wattup");
    }
}
