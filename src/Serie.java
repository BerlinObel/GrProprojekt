import java.text.DecimalFormat;

public class Serie {
    private String name;
    private int startyear;
    private int endyear;
    private String[] genre;
    private double rating;
    private int seasons;
    private int episodes;
    private int[] episodelist;


    public Serie(String name, int startyear, int endyear, String[] genre, double rating, int seasons, int episodes) {
        this.name = name;
        this.startyear = startyear;
        this.endyear = endyear;
        this.genre = genre;
        this.rating = rating;
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("0.#");
        return String.format("%s: %d-%d: %d: %d %s: " + df.format(rating),
                name, startyear, endyear, seasons, episodes, genre);

    }
}
