package com.project.sample1.controller;

//import org.springframework.stereotype.Controller;


import com.project.sample1.entities.Artist;
import com.project.sample1.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class mycontroller
{
    @Autowired
    private ArtistService artistService;



    @GetMapping("/home")
    public String home()
    {
        return "Welcome to the home page";
    }



    @GetMapping("/artists")
    public List<Artist> getArtists()
    {
        return this.artistService.getArtists();

    }

    @PutMapping("/artists")
    public Artist updateArtist(@RequestBody Artist artist){
        return this.artistService.updateArtist(artist);
    }

    @GetMapping("/artists/{artistId}")
    public Artist getArtist(@PathVariable String artistId)
    {
        return this.artistService.getArtist(Long.parseLong(artistId));
    }

    @DeleteMapping("/artists/{artistId}")
    public ResponseEntity<HttpStatus> deleteArtist(@PathVariable String artistId) {
        try
        {
            this.artistService.deleteArtist(Long.parseLong(artistId));
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path="/artists",consumes = "application/json")
    public Artist addArtist(@RequestBody Artist artist)
    {
        return this.artistService.addArtist(artist);
    }
}
