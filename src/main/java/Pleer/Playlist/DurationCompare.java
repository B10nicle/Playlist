package Pleer.Playlist;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static Pleer.Playlist.InputSongs.songList;

public class DurationCompare implements Comparator<Song> {
    @Override
    public int compare(@NotNull Song o1, @NotNull Song o2) {
        if (o1.duration() > o2.duration())
            return 1;
        else if (o1.duration() < o2.duration())
            return -1;
        else
            return 0;
    }

    public void compareByDuration() {
        var durationCompare = new DurationCompare();
        Set<Song> songSetComparedByDuration = new TreeSet<>(durationCompare);
        songSetComparedByDuration.addAll(songList);
        System.out.println("\nSorted by duration: ");
        for (Song song : songSetComparedByDuration) {
            System.out.println(song);
        }
    }
}
