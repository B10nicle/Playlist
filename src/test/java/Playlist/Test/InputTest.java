package Playlist.Test;

import Playlist.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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