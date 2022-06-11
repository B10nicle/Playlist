package Pleer.Playlist;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputSongs {
    static List<Song> songList = new ArrayList<>();
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
    public static void addSong(@NotNull String lineToParse) {
        String[] parts = lineToParse.split("/");
        Song nextSong = new Song(parts[0], parts[1], Double.parseDouble(parts[2]));
        songList.add(nextSong);
    }
}
