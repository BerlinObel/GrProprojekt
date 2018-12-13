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


    public class Viewer extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            primaryStage.setTitle("Fletnix");
            primaryStage.setScene(new Scene(root, 1400, 800));
            primaryStage.setResizable(true);
            primaryStage.show();

        }
    public static void main(String[] args) {
        launch(args);
    }

}
