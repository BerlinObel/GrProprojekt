import java.text.DecimalFormat;

public class Serie extends Media {
    private int startyear;
    private int endyear;
    private int seasons;
    private int episodes;
    private int[] episodelist;


    public Serie(String title, int startyear, int endyear, String[] genre, double rating, int seasons, int episodes) {
        super(title,genre,rating);
        this.startyear = startyear;
        this.endyear = endyear;
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.#");
        StringBuilder g = new StringBuilder();
        for (String aGenre : genre) {
            g.append(aGenre);
        }
        return String.format("Name: %s Dates: %d-%d Seasons: %d Episodes: %d Genres: %s Rating: " + df.format(rating),
                title, startyear, endyear, seasons, episodes, g.toString());

    }
}
