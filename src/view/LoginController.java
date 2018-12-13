package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Window;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;


public class LoginController {

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    private Stage stage;

    @FXML
    protected void handleLoginButtonAction(ActionEvent event) throws IOException {
        stage = (Stage) loginButton.getScene().getWindow();
        BorderPane root;
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene scene = new Scene(root,1400,800);
        stage.setScene(scene);
        stage.centerOnScreen();
    }

}