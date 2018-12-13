package view;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MenuController {
    public Button favoritesButton;
    public Button logoutButton;
    public TextField searchField;
    public CheckBox adv,act,bio,com,cri,dra,fam,fan,fn,his,hor,mus,mys,rom,sci,spo,thr,war,wes;
    public Button prevButton;
    public Button nextButton;
    public VBox box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12;
    public ImageView box6img;


    public void handleFavoritesButtonAction(ActionEvent actionEvent) {
    }

    public void handleLogoutButtonAction(ActionEvent actionEvent) {
    }

    public void handlePrevButtonAction(ActionEvent actionEvent) {
        Image image = new Image("view/Serie/Fargo.jpg");
        box6img.setImage(image);
    }

    public void handleNextButtonAction(ActionEvent actionEvent) {
    }
}
