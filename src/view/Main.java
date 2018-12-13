package view;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MediaReader mr = new MediaReader("C:\\Users\\Bruger\\Desktop\\GrProprojekt-master\\src\\view.Media.txt");
        try{
            List<Media> medias = mr.read();
            Sorter s = new Sorter();

            List<Media> searchedmedia = s.search(medias,"y");
            for(Media m: searchedmedia){
                System.out.println(m);
            }
            System.out.println();

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
    }
}