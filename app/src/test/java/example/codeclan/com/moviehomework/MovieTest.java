package example.codeclan.com.moviehomework;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */
public class MovieTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void canSetUpMovie() {
        Movie movie = new Movie("Jaws", 1, "Scary");
        assertEquals("Jaws", movie.getTitle());
    }

    @Test
    public void canCheckGenre() {
        Movie movie = new Movie("Jaws", 1, "Scary");
        assertEquals("Scary", movie.getGenre());
    }

    @Test
    public void canCheckRank() {
        Movie movie = new Movie("Jaws", 1, "Scary");
        assertEquals(1, movie.getRank());
    }

    @Test
    public void canCheckDetails(){
        Movie movie = new Movie("Jaws", 1, "Scary");
        System.out.println(movie.showDetails());
        assertNotNull(movie.showDetails());
    }

}
