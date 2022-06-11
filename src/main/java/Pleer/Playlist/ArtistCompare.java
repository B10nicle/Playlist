package Pleer.Playlist;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static Pleer.Playlist.InputSongs.songList;

public class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(@NotNull Song o1, @NotNull Song o2) {
        if (o1.artist().equalsIgnoreCase(o2.artist()) && !(o1.title().equalsIgnoreCase(o2.title()))) {
            return 1;
        }
        return (o1.artist().compareTo(o2.artist()));
    }

    public void compareByArtist() {
        var artistCompare = new ArtistCompare();
        Set<Song> songSetComparedByArtist = new TreeSet<>(artistCompare);
        songSetComparedByArtist.addAll(songList);
        System.out.println("\nSorted by artists: ");
        for (Song song : songSetComparedByArtist) {
            System.out.println(song);
        }
    }
}