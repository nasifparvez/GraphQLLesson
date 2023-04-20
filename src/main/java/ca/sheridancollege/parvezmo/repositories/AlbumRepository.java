package ca.sheridancollege.parvezmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.parvezmo.beans.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
