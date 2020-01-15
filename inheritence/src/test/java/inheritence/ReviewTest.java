package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest{
    @Test
    public void testReviewConstructor() {
        Review testReview = new Review("This is a test review.", "Arthur McAuthor", 1);
        String actual = testReview.author;
        assertEquals("Test review author should be Arthur McAuthor","Arthur McAuthor",actual);
    }
    @Test
    public void testReviewStringMethod(){
        Review testReview = new Review("This is a test review.", "Arthur McAuthor", 1);
        String expected = "Review body: \"This is a test review.\" Written by: Arthur McAuthor who gave 1 stars.";
        assertEquals("Testing string output",expected,testReview.toString());
    }
    @Test
    public void testReviewHasRestaurant(){
        Restaurant testaurant = new Restaurant("Testy Restaurant",1);
        Review testReview = new Review("Test review.","Test Author",1);
        testaurant.addReview(testReview);
        String expected = testaurant.name;
        assertEquals("Review should have 'Testy Restaurant as restaurant",expected,testReview.business);
    }
}