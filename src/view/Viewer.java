package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

/*    @Override
        public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setTitle("AK Streaming");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
*/
        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("Fletnix Welcome");
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setStyle("-fx-background-color: #323232;");
            grid.setPadding(new Insets(25, 25, 25, 25));

            Scene scene = new Scene(grid, 300, 275);
            primaryStage.setScene(scene);

            Image image = new Image("FletnixLogo.png");
            ImageView titleLogo = new ImageView();
            titleLogo.setFitWidth(240);
            titleLogo.setFitHeight(100);
            titleLogo.setImage(image);
            grid.add(titleLogo, 0, 0, 2, 1);

            Label userName = new Label("User Name:");
            userName.setTextFill(Color.WHITE);
            grid.add(userName, 0, 1);

            TextField userTextField = new TextField();
            userTextField.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #969696;");
            grid.add(userTextField, 1, 1);

            Label pw = new Label("Password:");
            pw.setTextFill(Color.WHITE);
            grid.add(pw, 0, 2);

            PasswordField pwBox = new PasswordField();
            pwBox.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #969696;");
            grid.add(pwBox, 1, 2);

            Button sign = new Button("Sign in");
            HBox hbsign = new HBox(10);
            hbsign.setAlignment(Pos.BOTTOM_RIGHT);
            hbsign.getChildren().add(sign);
            grid.add(hbsign, 1, 4);

            final Text actiontarget = new Text();
            grid.add(actiontarget, 1, 6);

            sign.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e) {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Sign in Failed");
                }
            });

            Button reg = new Button("Register");
            HBox hbreg = new HBox(10);
            hbreg.setAlignment(Pos.BOTTOM_LEFT);
            hbreg.getChildren().add(reg);
            grid.add(hbreg, 1, 4);

            reg.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e) {
                    actiontarget.setFill(Color.FIREBRICK);
                    actiontarget.setText("Registration Unavailable");

                }
            });

            primaryStage.show();
        }

    public static void main(String[] args) {
        launch(args);
    }

}
