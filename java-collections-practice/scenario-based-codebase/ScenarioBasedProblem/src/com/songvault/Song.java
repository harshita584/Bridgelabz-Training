package com.songvault;

public class Song extends Media<String> {
    private String title;
    private String artist;
    private String duration;
    private String genre;

    public Song(String title, String artist, String duration, String genre) {
        super("Audio");
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return title + " " + artist + " " + duration + " " + genre;
    }
}
