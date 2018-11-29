import java.text.DecimalFormat;

public class Film {
    private String name;
    private int year;
    private String[] genre;
    private double rating;

    public Film(String name, int year, String[] genre, double rating) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    enum GENRE {
        Crime, Drama, History, Biography, Sport, Romance, War, Mystery, Adventure, Family, Fantasy, Thriller, FilmNoir, Musical, SciFi, Comedy, Action, Western, Horror, Music, Unknown
    }

    private GENRE parseType(String genre){
        switch (genre.toLowerCase()){
            case "crime": return GENRE.Crime;
            case "drama": return GENRE.Drama;
            case "history": return GENRE.History;
            case "biography": return GENRE.Biography;
            case "sport": return GENRE.Sport;
            case "romance": return GENRE.Romance;
            case "war": return GENRE.War;
            case "mystery": return GENRE.Mystery;
            case "adventure": return GENRE.Adventure;
            case "family": return GENRE.Family;
            case "fantasy": return GENRE.Fantasy;
            case "thriller": return GENRE.Thriller;
            case "film-noir": return GENRE.FilmNoir;
            case "musical": return GENRE.Musical;
            case "sci-fi": return GENRE.SciFi;
            case "comedy": return GENRE.Comedy;
            case "action": return GENRE.Action;
            case "western": return GENRE.Western;
            case "horror": return GENRE.Horror;
            case "music": return GENRE.Music;
            default: return GENRE.Unknown;
        }
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.#");
        StringBuilder g = new StringBuilder();
        for (String aGenre : genre) {
            g.append(aGenre);
        }
        return String.format("%s: %d: %s: " + df.format(rating),
                name, year, g.toString());

    }

}
