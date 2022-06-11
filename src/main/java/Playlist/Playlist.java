package Playlist;

import java.io.*;
import java.util.*;

public class Playlist {
    static List<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        var playlist = new Playlist();
        playlist.start();
    }

    public void start() {
        var artistCompare = new ArtistCompare();
        var durationCompare = new DurationCompare();
        var titleCompare = new TitleCompare();
        titleCompare.compareByTitle();
        getSongs();

        Set<Song> songSetComparedByArtist = new TreeSet<>(artistCompare);
        songSetComparedByArtist.addAll(songList);
        System.out.println("\nSorted by artists: ");
        for (Song song : songSetComparedByArtist) {
            System.out.println(song);
        }

        Set<Song> songSetComparedByDuration = new TreeSet<>(durationCompare);
        songSetComparedByDuration.addAll(songList);
        System.out.println("\nSorted by duration: ");
        for (Song song : songSetComparedByDuration) {
            System.out.println(song);
        }

    }

    public static class ArtistCompare implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            if (o1.artist().equalsIgnoreCase(o2.artist()) && !(o1.title().equalsIgnoreCase(o2.title()))) {
                return 1;
            }
            return (o1.artist().compareTo(o2.artist()));
        }
    }

    public static class DurationCompare implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            if (o1.duration() > o2.duration())
                return 1;
            else if (o1.duration() < o2.duration())
                return -1;
            else
                return 0;
        }
    }

    public static void getSongs() {
        try {
            File file = new File("songlist.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addSong(String lineToParse) {
        String[] parts = lineToParse.split("/");
        Song nextSong = new Song(parts[0], parts[1], Double.parseDouble(parts[2]));
        songList.add(nextSong);
    }
}