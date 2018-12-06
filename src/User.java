import java.util.ArrayList;
public class User {
    private String name;
    private ArrayList<Media> favorites;
    public User(String name){
        this.name = name;
        favorites = new ArrayList<>();
        }
        String getName(){
            return name;
        }
}


