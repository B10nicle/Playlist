package Pleer.Playlist;

import static Pleer.Playlist.InputSongs.getSongs;

public class Playlist {
    public static void main(String[] args) {
        var duration = new DurationCompare();
        var title = new TitleCompare();
        var artist = new ArtistCompare();
        getSongs();
        title.compareByTitle();
        artist.compareByArtist();
        duration.compareByDuration();
    }
}