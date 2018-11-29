import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SerieReader fr = new SerieReader("C:\\Users\\Bruger\\Desktop\\SeriesReader\\src\\Serie.txt");
        try{
            List<Serie> series = fr.read();
            for(Serie s: series){
                System.out.println(s);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}