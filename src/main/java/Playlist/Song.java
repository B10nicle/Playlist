package Playlist;

import java.util.Objects;

public record Song(String title, String artist, Double duration) {

    @Override
    public String toString() {
        return title + " - " + artist + ", " + duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        if (!Objects.equals(title, song.title)) return false;
        return Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        return result;
    }
}