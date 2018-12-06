import java.util.ArrayList;
public abstract class Media {
    protected String title;
    protected ArrayList<String> genre;
    protected double rating;

    public Media(String title, ArrayList<String> genre, double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    }

    public ArrayList<String> getGenre(){
        return genre;
    }

    public double getRating(){
        return rating;
    }

    public void addGenre(){

    }
}
