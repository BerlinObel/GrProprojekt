package view;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ListIterator;


public class Main {
    public static void main(String[] args) {
        List<Media> ayy;
        MediaReader mr = new MediaReader("/Users/oscarobel/Media.txt");
        try{
            List<Media> medias = mr.read();

            Sorter s = new Sorter();

            List<Media> searchedmedia = s.search(medias,"y");
            for(Media m: searchedmedia){
                System.out.println(m);
            }

            List<Media> dramamedia = s.genreSearch(searchedmedia, Media.GENRE.Drama);
            for(Media m: dramamedia){
                System.out.println(m);
            }
            System.out.println();

            s.ratingHigh(dramamedia);
            for(Media m: dramamedia){
                System.out.println(m);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            ayy =mr.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}