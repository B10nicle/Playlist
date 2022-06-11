package Playlist;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static Playlist.Playlist.songList;

public class TitleCompare implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        if (o1.title().equalsIgnoreCase(o2.title()) && !(o1.artist().equalsIgnoreCase(o2.artist()))) {
            return 1;
        }
        return (o1.title().compareTo(o2.title()));
    }

    public void compareByTitle() {
        var titleCompare = new TitleCompare();
        Set<Song> songSetComparedByTitle = new TreeSet<>(titleCompare);
        songSetComparedByTitle.addAll(songList);
        System.out.println("\nSorted by titles:");
        for (Song song : songSetComparedByTitle) {
            System.out.println(song);
        }
    }
}