package Pleer.Test;

import Pleer.Playlist.Playlist;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InputTest extends Assert {

    @Before
    public void Start() {
        var playlist = new Playlist();
        playlist.start();
    }

    @Test
    public void testInput() {
    }

}