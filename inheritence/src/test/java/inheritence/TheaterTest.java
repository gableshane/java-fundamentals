package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void testTheaterConstructor(){
        Theater testTheater = new Theater("Test");
        assertEquals("Test theater should exist.","Test",testTheater.name);
    }
    @Test
    public void testAddMovie(){
        Theater testTheater = new Theater("Test");
        testTheater.addMovie("The Matrix");
        assertTrue("The Matrix should exist in test theater movies",testTheater.movies.contains("The Matrix"));
    }
    @Test
    public void testRemoveMovie(){
        Theater testTheater = new Theater("Test");
        testTheater.addMovie("The Matrix");
        testTheater.removeMovie("The Matrix");
        assertFalse("The Matrix should not be listed in movies.",testTheater.movies.contains("The Matrix"));
    }
    @Test
    public void testToStringNoMovie(){
        Theater testTheater = new Theater("Test");
        String expected = "Theater name: Test\n" +
                "Now playing: [No showings]\n" +
                "--REVIEWS--\n" +
                "[Review]: No results]";
        assertEquals("The string output should be as expected",expected,testTheater.toString());
    }
    @Test
    public void testToStringWithMovies(){
        Theater testTheater = new Theater("Test");
        testTheater.addMovie("The Matrix");
        String expected = "Theater name: Test\n" +
                "Now playing: [The Matrix]\n" +
                "--REVIEWS--\n" +
                "[Review]: No results]";
        assertEquals("The string output should be as expected",expected,testTheater.toString());
    }
    @Test
    public void testToStringWithMoviesAndReviews(){
        Theater testTheater = new Theater("Test");
        testTheater.addMovie("The Matrix");
        Review testReview = new Review("Test review.","Test Author",1);
        testTheater.addReview(testReview);
        String expected = "Theater name: Test\n" +
                "Now playing: [The Matrix]\n" +
                "--REVIEWS--\n" +
                "[Review]: Review body: \"Test review.\" Written by: Test Author who gave 1 stars.]";
        assertEquals("The output should be as expected,",expected,testTheater.toString());
    }
    @Test
    public void testAddReviewTheater(){
        Theater testTheater = new Theater("Test");
        Review testReview = new Review("Test review.","Test Author",1);
        testTheater.addReview(testReview);
        assertNotNull("Theater reviews should not be null",testTheater.reviews);
    }
    @Test
    public void testReviewWithMovie(){
        Theater testTheater = new Theater("Test");
        Review testReview = new Review("Test review.","Test Author",1,"The Matrix");
        testTheater.addReview(testReview);
        assertEquals("The review should have the movie title","The Matrix",testTheater.reviews.movie);
    }
}