import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilmReader {
    private String fileName;

    public FilmReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Film> read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<Film> films = read(br);
        br.close();
        return films;
    }

    private List<Film> read(BufferedReader br) {
        List<Film> films = new ArrayList<>();
        try{
            String line = br.readLine();
            while(br.ready() && line != null){
                line = br.readLine();
                String[] info = line.split(";");
                String name = info[0];
                int year = Integer.parseInt(info[1].trim());
                String genreinfo = info[2].trim();
                String[] genre = genreinfo.split(",");
                double rating = Double.parseDouble(info[3].trim());
                Film f = new Film(name,year, genre,rating);
                films.add(f);

            }
        } catch (IOException e){
            return null;
        }
        return films;
    }

}
