package ca.sheridancollege.parvezmo.services;



import java.util.List;


import ca.sheridancollege.parvezmo.beans.Album;

public interface AlbumService {

    //create
    Album create(Album album);

    //get all
    List<Album> getAll();

    //get single book
    Album get(int albumId);

}
