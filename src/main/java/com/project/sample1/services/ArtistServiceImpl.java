package com.project.sample1.services;

import com.project.sample1.entities.Artist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistServiceImpl implements ArtistService {

    List<Artist> list;

    public ArtistServiceImpl(){
        list = new ArrayList<>();
        list.add(new Artist(100,"Artist Name","Album Name"));
    }

    @Override
    public List<Artist> getArtists() {
        return list;
    }

    @Override
    public Artist getArtist(long artisId) {

        Artist a=null;
        for(Artist artist:list)
        {
            if(artist.getId()==artisId) a=artist;
            break;
        }
        return a;
    }

    @Override
    public Artist addArtist(Artist artist) {

        list.add(artist);

        return artist;

    }

    @Override
    public Artist updateArtist(Artist artist) {

        list.forEach(e-> {
            if (e.getId()==artist.getId())
            {
                e.setName(artist.getName());
                e.setAlbum(artist.getAlbum());
            }
        });

        return artist;

    }

    @Override
    public void deleteArtist(long parseLong) {
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());

    }
}
