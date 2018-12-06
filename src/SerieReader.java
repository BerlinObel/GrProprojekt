import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerieReader {
    private String fileName;

    public SerieReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Serie> read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<Serie> series = read(br);
        br.close();
        return series;
    }

    private List<Serie> read(BufferedReader br) {
        List<Serie> series = new ArrayList<>();
        try{
            String line = br.readLine();
            while(br.ready() && line != null){
                line = br.readLine();
                String[] info = line.split(";");
                String name = info[0];
                String[] yearinfo = info[1].split("-");
                int startyear = Integer.parseInt(yearinfo[0].trim());
                int endyear = 2018;
                if(yearinfo.length == 2 && !yearinfo[1].trim().equals("")){
                    endyear = Integer.parseInt(yearinfo[1].trim());}
                String genreinfo = info[2].trim();
                ArrayList<String> genre = genreinfo.split(",");
                double rating = Double.parseDouble(info[3].trim());
                String[] seasoninfo = info[4].split(",");
                int seasons = seasoninfo.length;
                int episodes = 0;
                for(int i = 0; i < seasons; i++){
                    String[] episodeinfo = seasoninfo[i].split("-");
                    episodes += Integer.parseInt(episodeinfo[1]);
                }
                Serie s = new Serie(name,startyear,endyear,genre,rating,seasons,episodes);
                series.add(s);

            }
        } catch (IOException e){
            return null;
        }
        return series;
    }

}
