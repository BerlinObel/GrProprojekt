package view;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.List;

public class MenuController {
    public Button favoritesButton;
    public Button logoutButton;
    public TextField searchField;
    public CheckBox adv,act,bio,com,cri,dra,fam,fan,fn,his,hor,mus,mys,rom,sci,spo,thr,war,wes;
    public Button prevButton;
    public Button nextButton;
    public VBox box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12;
    public ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;
    public Label text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12;


    public void handleFavoritesButtonAction(ActionEvent actionEvent) {
    }

    public void handleLogoutButtonAction(ActionEvent actionEvent) {
    }

    public void handlePrevButtonAction(ActionEvent actionEvent) {
        MediaReader mr = new MediaReader("/Users/oscarobel/Media.txt");
        List<Media> medias = null;
        try {
            medias = mr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder pic = new StringBuilder();
        pic.append("/");
        pic.append(medias.get(7).getClass().getName().replace(".","/"));
        pic.append("/");
        pic.append(medias.get(7).getTitle());
        pic.append(".jpg");
        Image image = new Image(pic.toString());
        img6.setImage(image);
        text6.setText(medias.get(7).getTitle());

    }

    public void handleNextButtonAction(ActionEvent actionEvent) {
    }
}
