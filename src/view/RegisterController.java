package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

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
    private Button returnButton;

    private Stage stage;

    @FXML
    protected void handleReturnButtonAction(ActionEvent event) throws IOException {
        stage = (Stage) returnButton.getScene().getWindow();
        GridPane root;
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();

    }

    public void handleCreateButtonAction(ActionEvent actionEvent) throws IOException{
        stage = (Stage) createButton.getScene().getWindow();
        BorderPane root;
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root,1400,800);
        stage.centerOnScreen();
        stage.setScene(scene);
    }
}
