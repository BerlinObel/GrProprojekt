package view;

import java.util.ArrayList;
public class User {
    private String name;
    private ArrayList<Media> favorites;
    private Boolean admin;
    private Boolean active;
    public User(String name){
        this.name = name;
        favorites = new ArrayList<>();
        admin = false;
        active= false;
        }

        public String getName(){
            return name;
        }

        public ArrayList<Media> getFavorites(){
            return favorites;
        }

        public void addFavorites(Media n){
            favorites.add(n);
        }

        public void removeFavorites(Media n){
            for (int i = 0; i<favorites.size();i++){
                if(favorites.get(i).equals(n)){
                    favorites.remove(i);
                }
            }
        }

        public void makeAdmin(){
            admin = true;
        }
        public void revokeAdmin(){
            admin = false;
        }
        public void activate(){active = true;}
        public void deactivate(){active = false;}


}


