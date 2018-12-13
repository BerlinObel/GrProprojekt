package view;

import java.util.ArrayList;
public class User {
    private String name;
    private ArrayList<Media> favorites;
    private Boolean Admin;
    public User(String name){
        this.name = name;
        favorites = new ArrayList<>();
        Admin = false;
        }

        String getName(){
            return name;
        }

        ArrayList<Media> getFavorites(){
            return favorites;
        }

        void addFavorites(Media n){
            favorites.add(n);
        }

        void removeFavorites(Media n){
            for (int i = 0; i<favorites.size();i++){
                if(favorites.get(i).equals(n)){
                    favorites.remove(i);
                }
            }
        }

        void makeAdmin(){
            Admin = true;
        }
        void revokeAdmin(){
            Admin = false;
        }


}


