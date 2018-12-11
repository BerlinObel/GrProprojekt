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
            primaryStage.setTitle("Fletnix");
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setStyle("-fx-background-color: #323232;");
            grid.setPadding(new Insets(25, 25, 25, 25));

            Scene login = new Scene(grid, 300, 275);
            primaryStage.setScene(login);

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
            userTextField.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #c8c8c8;");
            grid.add(userTextField, 1, 1);

            Label pw = new Label("Password:");
            pw.setTextFill(Color.WHITE);
            grid.add(pw, 0, 2);

            PasswordField pwBox = new PasswordField();
            pwBox.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #c8c8c8;");
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
                    register(primaryStage);
                }
            });



            primaryStage.show();
        }

        public void register(Stage primaryStage){
            GridPane reggrid = new GridPane();
            reggrid.setAlignment(Pos.CENTER);
            reggrid.setHgap(10);
            reggrid.setVgap(10);
            reggrid.setStyle("-fx-background-color: #323232;");
            Scene scene = new Scene(reggrid, 450, 400);
            reggrid.setPadding(new Insets(25, 25, 25, 25));
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();

            Image image = new Image("FletnixLogo.png");
            ImageView titleLogo = new ImageView();
            titleLogo.setFitWidth(340);
            titleLogo.setFitHeight(100);
            titleLogo.setImage(image);
            reggrid.add(titleLogo, 0, 0, 2, 1);

            Label fuserName = new Label("Full name:");
            fuserName.setTextFill(Color.WHITE);
            reggrid.setHalignment(fuserName, HPos.RIGHT);
            reggrid.add(fuserName, 0, 1);

            TextField userTextField = new TextField();
            userTextField.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #c8c8c8;");
            reggrid.add(userTextField, 1, 1);

            Label userName = new Label("Username:");
            userName.setTextFill(Color.WHITE);
            reggrid.setHalignment(userName, HPos.RIGHT);
            reggrid.add(userName, 0, 2);

            TextField fuserTextField = new TextField();
            fuserTextField.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #c8c8c8;");
            reggrid.add(fuserTextField, 1, 2);

            Label pw = new Label("Password:");
            pw.setTextFill(Color.WHITE);
            reggrid.setHalignment(pw, HPos.RIGHT);
            reggrid.add(pw, 0, 3);

            PasswordField pwBox = new PasswordField();
            pwBox.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #c8c8c8;");
            reggrid.add(pwBox, 1, 3);

            Label cpw = new Label("confirm Password:");
            cpw.setTextFill(Color.WHITE);
            reggrid.setHalignment(cpw, HPos.RIGHT);
            reggrid.add(cpw, 0, 4);

            PasswordField cpwBox = new PasswordField();
            cpwBox.setStyle("-fx-background-color: #505050; -fx-text-inner-color: #c8c8c8;");
            reggrid.add(cpwBox, 1, 4);

            Label bday = new Label("Date of Birth:");
            bday.setTextFill(Color.WHITE);
            reggrid.setHalignment(bday, HPos.RIGHT);
            reggrid.add(bday, 0, 6);

            DatePicker birthDate = new DatePicker();
            birthDate.setStyle("-fx-control-inner-background: #505050; -fx-text-inner-color: #c8c8c8");
            reggrid.add(birthDate,1,6);

            Button crt = new Button("Create");
            HBox hbcrt = new HBox(10);
            hbcrt.setAlignment(Pos.BOTTOM_RIGHT);
            hbcrt.getChildren().add(crt);
            reggrid.add(hbcrt, 1, 8);

            final Text actiontarget = new Text();
            reggrid.add(actiontarget, 1, 10);

            crt.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e) {
                    menu(primaryStage);
                }
            });


        }

        public void menu(Stage primaryStage){
            primaryStage.setTitle("Fletnix");
            BorderPane border = new BorderPane();
            Scene scene = new Scene(border, 1400, 800);
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();

            HBox hbox = new HBox();
            hbox.setPadding(new Insets(15, 12, 15, 12));
            hbox.setSpacing(10);
            hbox.setStyle("-fx-background-color: #505050;");
            Image image = new Image("FletnixLogo.png");
            ImageView titleLogo = new ImageView();
            titleLogo.setFitWidth(180);
            titleLogo.setFitHeight(100);
            titleLogo.setImage(image);
            hbox.getChildren().addAll(titleLogo);
            border.setTop(hbox);

        }



    public static void main(String[] args) {
        launch(args);
    }

}
