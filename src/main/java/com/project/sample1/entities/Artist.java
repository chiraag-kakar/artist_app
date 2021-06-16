package com.project.sample1.entities;

public class Artist {

    private long id;
    private String name;
    private String album;

    public Artist(long id, String name, String album) {
        this.id = id;
        this.name = name;
        this.album = album;
    }

    public Artist() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
