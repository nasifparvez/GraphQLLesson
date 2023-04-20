package ca.sheridancollege.parvezmo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import ca.sheridancollege.parvezmo.beans.Album;
import ca.sheridancollege.parvezmo.services.AlbumService;
import lombok.Getter;
import lombok.Setter;

@Controller
public class AlbumController {
    @Autowired
    private AlbumService albumService;
    //Create Our Album Within the API
    @MutationMapping("createAlbum")
    public Album create(@Argument AlbumInput album) {
	       Album a=new Album();
	        a.setTitle(album.getTitle());
	        a.setGenre(album.getGenre());
	        a.setPrice(album.getPrice());
	        a.setArtist(album.getArtist());
	        return this.albumService.create(a);
    	}
    //Get All Albums Within the API
    @QueryMapping("allAlbums")
	public List<Album> getAll() {
    	return this.albumService.getAll();
	}
    //Get Album By Album ID
    @QueryMapping("getAlbumById")
    public Album getAlbumById(@Argument int albumId) {
        return this.albumService.get(albumId);
    }
}
@Getter
@Setter
class AlbumInput{
	 private String title;
	 private String artist;
	 private String genre;
	 private double price;
	 
}
