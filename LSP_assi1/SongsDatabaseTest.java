package howard.edu.lsp.finals.problem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
    }

    @Test
    public void testAddSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        Assert.assertTrue(rapSongs.contains("Savage"));
        Assert.assertTrue(rapSongs.contains("Gin and Juice"));
        Assert.assertEquals(2, rapSongs.size());

        Set<String> jazzSongs = db.getSongs("Jazz");
        Assert.assertTrue(jazzSongs.contains("Always There"));
        Assert.assertEquals(1, jazzSongs.size());
    }

    @Test
    public void testGetSongs() {
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        Assert.assertTrue(rapSongs.contains("Savage"));
        Assert.assertTrue(rapSongs.contains("Gin and Juice"));
        Assert.assertEquals(2, rapSongs.size());

        Set<String> jazzSongs = db.getSongs("Jazz");
        Assert.assertTrue(jazzSongs.contains("Always There"));
        Assert.assertEquals(1, jazzSongs.size());

        Set<String> popSongs = db.getSongs("Pop");
        Assert.assertNotNull(popSongs);
        Assert.assertTrue(popSongs.isEmpty());
    }

    @Test
    public void testGetGenreOfSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        String genre1 = db.getGenreOfSong("Savage");
        Assert.assertEquals("Rap", genre1);

        String genre2 = db.getGenreOfSong("Always There");
        Assert.assertEquals("Jazz", genre2);

        String genre3 = db.getGenreOfSong("Imagine");
        Assert.assertEquals("Imagine", genre3);
    }
}
