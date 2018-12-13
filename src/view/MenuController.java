package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

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
    @FXML
    private List<Label> textList;
    @FXML
    private List<ImageView> imgList;
    private int page = 0;

    private MediaReader mr = new MediaReader("/Users/oscarobel/Media.txt");
    private List<Media> medias = null;
    public void initialize(){
        try {
            medias = mr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Label> textList = new ArrayList<Label>();
        List<ImageView> imgList = new ArrayList<ImageView>();

    }


    public void handleFavoritesButtonAction(ActionEvent actionEvent) {
    }

    public void handleLogoutButtonAction(ActionEvent actionEvent) {
    }

    public void handleNextButtonAction(ActionEvent actionEvent) {
        for(int i=0; i < 12; i++){
            StringBuilder pic = new StringBuilder();
            pic.append("/");
            pic.append(medias.get(i+page).getClass().getName().replace(".","/"));
            pic.append("/");
            pic.append(medias.get(i+page).getTitle());
            pic.append(".jpg");
            Image image = new Image(pic.toString());
            imgList.get(i).setImage(image);
            textList.get(i).setText(medias.get(i+page).getTitle());
        }
        page+=12;
    }

    public void handlePrevButtonAction(ActionEvent actionEvent) {
        for(int i=11;i>-1; i--){
            StringBuilder pic = new StringBuilder();
            pic.append("/");
            pic.append(medias.get(i-page).getClass().getName().replace(".","/"));
            pic.append("/");
            pic.append(medias.get(i-page).getTitle());
            pic.append(".jpg");
            Image image = new Image(pic.toString());
            imgList.get(i).setImage(image);
            textList.get(i).setText(medias.get(i-page).getTitle());
        }
        page-=12;
    }

    public void btn12Action(ActionEvent actionEvent) {
    }
}
