import java.text.DecimalFormat;
import java.util.ArrayList;
public abstract class Media {
    protected String title;
    protected ArrayList<GENRE> genre;
    protected double rating;

    public Media(String title, String[] genres, double rating) {
        this.title = title;
        this.rating = rating;
        genre = new ArrayList<>();
        for (String type : genres) {
            type = type.replaceAll("(^\\h*)|(\\h*$)", "").trim();
            GENRE n = parseGenre(type);
            genre.add(n);
        }
    }

    enum GENRE {
        Crime, Drama, History, Biography, Sport, Romance, War, Mystery, Adventure, Family, Fantasy, Thriller, FilmNoir, Musical, SciFi, Comedy, Action, Western, Horror, Music, Unknown
    }

    public GENRE parseGenre(String genre) {
        genre.trim();
        switch (genre.toLowerCase()) {
            case "crime":
                return GENRE.Crime;
            case "drama":
                return GENRE.Drama;
            case "history":
                return GENRE.History;
            case "biography":
                return GENRE.Biography;
            case "sport":
                return GENRE.Sport;
            case "romance":
                return GENRE.Romance;
            case "war":
                return GENRE.War;
            case "mystery":
                return GENRE.Mystery;
            case "adventure":
                return GENRE.Adventure;
            case "family":
                return GENRE.Family;
            case "fantasy":
                return GENRE.Fantasy;
            case "thriller":
                return GENRE.Thriller;
            case "film-noir":
                return GENRE.FilmNoir;
            case "musical":
                return GENRE.Musical;
            case "sci-fi":
                return GENRE.SciFi;
            case "comedy":
                return GENRE.Comedy;
            case "action":
                return GENRE.Action;
            case "western":
                return GENRE.Western;
            case "horror":
                return GENRE.Horror;
            case "music":
                return GENRE.Music;
            default:
                return GENRE.Unknown;
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<GENRE> getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public void addGenre(GENRE newgenre) {
        genre.add(newgenre);
    }
}
