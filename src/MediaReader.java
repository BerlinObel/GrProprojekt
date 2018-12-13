import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MediaReader {
    private String fileName;

    public MediaReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Media> read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<Media> medias = read(br);
        br.close();
        return medias;
    }

    private List<Media> read(BufferedReader br) {
        List<Media> medias = new ArrayList<>();
        try{
            String line = br.readLine();
            while(br.ready() && line != null){
                line = br.readLine();
                String[] info = line.split(";");
                String name = info[0];
                String genreinfo = info[2].trim();
                String[] genre = genreinfo.split(",");
                double rating = Double.parseDouble(info[3].trim());
                if(info.length == 4){
                    int year = Integer.parseInt(info[1].trim());
                    Film m = new Film(name,year,genre,rating);
                    medias.add(m);
                }
                if(info.length == 5){
                    String[] yearinfo = info[1].split(" -");
                    int startyear = Integer.parseInt(yearinfo[0].trim());
                    int endyear = 2018;
                    if(yearinfo.length == 2 && !yearinfo[1].trim().equals("")){
                        endyear = Integer.parseInt(yearinfo[1].trim());}
                    String[] seasoninfo = info[4].split(",");
                    int seasons = seasoninfo.length;
                    int episodes = 0;
                    for(int i = 0; i < seasons; i++){
                        String[] episodeinfo = seasoninfo[i].split("-");
                        episodes += Integer.parseInt(episodeinfo[1]);
                    }
                    Serie m = new Serie(name,startyear,endyear,genre,rating,seasons,episodes);
                    medias.add(m);
                }
            }
        } catch (IOException e){
            return null;
        }
        return medias;
    }

}
