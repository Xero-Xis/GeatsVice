package org.howard.edu.lsp.finalproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
//Miles Adedjouma



public class SongDatabaseTest {
    private SongDatabase db;

    @BeforeEach
    public void setUp() {
        db = new SongDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");
    }

    @Test
    public void testAddSong() {
        db.addSong("Pop", "Thriller");
        Set<String> songs = db.getSongs("Pop");
        assertTrue(songs.contains("Thriller"));
    }

    @Test
    public void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> expectedRapSongs = new HashSet<>();
        expectedRapSongs.add("Savage");
        expectedRapSongs.add("Gin and Juice");
        assertEquals(expectedRapSongs, rapSongs);

        Set<String> jazzSongs = db.getSongs("Jazz");
        Set<String> expectedJazzSongs = new HashSet<>();
        expectedJazzSongs.add("Always There");
        assertEquals(expectedJazzSongs, jazzSongs);
    }

    @Test
    public void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Rap", db.getGenreOfSong("Gin and Juice"));
    }
}