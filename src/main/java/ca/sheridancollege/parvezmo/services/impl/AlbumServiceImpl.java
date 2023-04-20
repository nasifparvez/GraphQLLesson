package ca.sheridancollege.parvezmo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.parvezmo.beans.Album;
import ca.sheridancollege.parvezmo.repositories.AlbumRepository;
import ca.sheridancollege.parvezmo.services.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {
	
    private AlbumRepository albumRepo;
    
    @Autowired
    public AlbumServiceImpl(AlbumRepository albumRepo) {
        this.albumRepo = albumRepo;
    }

	@Override
	public Album create(Album album) {
		return this.albumRepo.save(album);
	}

	@Override
	public List<Album> getAll() {
		return this.albumRepo.findAll();
	}

	@Override
	public Album get(int albumId) {
		return this.albumRepo.findById(albumId).orElseThrow(() -> new RuntimeException("The album you are looking for is not here!!"));
	}

}
