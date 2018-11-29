import java.util.*;
public class User {
    public String name;
    public Array<Media> favorites;
    public User(String name){
        this.name = name;
        favorites = new Array<>();
    }
    String getName(){
        return name;
    }
}
