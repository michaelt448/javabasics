package builtins.challenge.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song song = findSong(title);

        if (song != null) {
            return false;
        } else {
            this.songs.add(new Song(title, duration));
            return true;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber-1;
        if (index >= 0 && index <= this.songs.size()) {
            Song currSong = this.songs.get(index);
            playlist.add(currSong);
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String titleString, LinkedList<Song> playlist) {
        Song song = findSong(titleString);
        if (song != null) {
            playlist.add(song);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song song: this.songs) {
            if (song.getTitle().equals(title)) return song;
        }
        return null;
    }
}
