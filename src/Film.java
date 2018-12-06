import java.text.DecimalFormat;
import java.util.ArrayList;

public class Film  extends Media {
    private int year;

    public Film(String title, int year, String[] genre, double rating) {
        super(title, genre, rating);
        this.year = year;
    }



    public String toString(){
        DecimalFormat df = new DecimalFormat("0.#");
        StringBuilder g = new StringBuilder();
        for (GENRE aGenre : genre) {
            g.append(aGenre);
        }
        return String.format("%s: %d: %s: " + df.format(rating),
                title, year, g.toString());

    }

}
