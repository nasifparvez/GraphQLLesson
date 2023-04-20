package ca.sheridancollege.parvezmo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ca.sheridancollege.parvezmo.beans.Album;
import ca.sheridancollege.parvezmo.services.AlbumService;

@SpringBootApplication
public class GraphQlLessonApplication implements CommandLineRunner {
	
	  @Autowired
	  private AlbumService albumService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlLessonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		   Album a1 = new Album();
         a1.setTitle("Quest for Fire");
         a1.setGenre("Dance/Electronic");
         a1.setPrice(14.99);
         a1.setArtist("Skrillex");
         
         Album a2 = new Album();
         a2.setTitle("Never Enough");
         a2.setGenre("R&B/Soul");
         a2.setPrice(18.99);
         a2.setArtist("Daniel Caesar");
         
         Album a3 = new Album();
         a3.setTitle("10000 Gecs");
         a3.setGenre("Hyperpop");
         a3.setPrice(9.99);
         a3.setArtist("100 Gecs");
         
         this.albumService.create(a1);
         this.albumService.create(a2);
         this.albumService.create(a3);


		
	}

}
