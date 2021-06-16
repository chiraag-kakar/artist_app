package com.project.sample1.dao;

//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

//public interface ArtistDao extends JpaRepositoriesAutoConfiguration <Artist, Long> {
//}


import com.project.sample1.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistDao extends JpaRepository<Artist , Long> {

}

