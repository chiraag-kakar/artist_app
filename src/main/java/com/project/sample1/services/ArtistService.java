package com.project.sample1.services;

import com.project.sample1.entities.Artist;

import java.util.List;

public interface ArtistService {

    public List<Artist> getArtists();

    public Artist getArtist(long artisId);

    public Artist addArtist(Artist artist);

    public Artist updateArtist(Artist artist);

    public void deleteArtist(long parseLong);
}
