package view;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Film  extends Media {
    private int year;

    public Film(String title, int year, String[] genre, double rating) {
        super(title, genre, rating);
        this.year = year;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.#");
        StringBuilder g = new StringBuilder();
        for (GENRE aGenre : genre) {
            g.append(aGenre);
            g.append(" ");}
        return String.format("Name: %s: Year: %d: Genres: %s: Rating: " + df.format(rating),
                title, year, g.toString());
    }

    public String getTitle () {
        return title;
    }

    public ArrayList<GENRE> getGenre () {
        return genre;
    }

    public double getRating () {
        return rating;
    }

    public void addGenre (GENRE newgenre){
        genre.add(newgenre);
    }

}
