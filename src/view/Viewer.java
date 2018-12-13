package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.*;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class Viewer extends Application {
        private Stage primaryStage;
        private Parent root;
        @Override
        public void start(Stage primaryStage) throws Exception {
            this.primaryStage = primaryStage;
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("Login.fxml"));
            Parent root = loader.load();
            primaryStage.setTitle("Fletnix");
            primaryStage.setScene(new Scene(root, 350, 300));
            primaryStage.setResizable(false);
            primaryStage.show();
        }

    public static void main(String[] args) {
        launch(args);
    }

}
