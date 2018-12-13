package view;

import java.util.ArrayList;
import java.util.List;
public class Sorter {
    public void titleAZ(List<Media> medias) {
        medias.sort((media1, media2) -> media1.getTitle().compareTo(media2.getTitle()));
    }

    public void titleZA(List<Media> medias){
        medias.sort((media1, media2) -> media2.getTitle().compareTo(media1.getTitle()));
    }

    public void ratingHigh(List<Media> medias){
        medias.sort((media1, media2) -> Double.compare(media2.getRating(), media1.getRating()));
    }

    public void ratingLow(List<Media> medias){
        medias.sort((media1, media2) -> Double.compare(media1.getRating(), media2.getRating()));
    }

    public List<Media> search(List<Media> medias, String searchterm){
        List<Media> searchedmedia = new ArrayList<>();
        for(Media media: medias){
            if(media.getTitle().trim().toLowerCase().contains(searchterm.trim().toLowerCase())){
                searchedmedia.add(media);
            }
        }
        return searchedmedia;
    }

    public List<Media> genreSearch(List<Media> medias, Media.GENRE g){
        List<Media> genremedia = new ArrayList<>();
        for(Media media: medias){
            if(media.getGenre().contains(g)){
                genremedia.add(media);
            }
        }
        return genremedia;
    }
}