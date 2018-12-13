package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class RegisterController {
    @FXML
    private TextField fullnameField;
    @FXML
    private TextField nameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField repasswordField;
    @FXML
    private Button createButton;
    @FXML
    private Button loginButton;

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) {
        Window owner = loginButton.getScene().getWindow();
        if(fullnameField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Error!",
                    "Please enter your name");
            return;
        }
        if(nameField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Error!",
                    "Please enter a Username");
            return;
        }
        if(passwordField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Error!",
                    "Please enter a password");
            return;
        }
        if(!repasswordField.getText().equals(passwordField.getText())) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Error!",
                    "Password do not match");
            return;
        }

    }

    public void handleCreateButtonAction(ActionEvent actionEvent) {
    }
}
