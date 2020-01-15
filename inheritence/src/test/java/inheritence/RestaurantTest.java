package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testRestaurantConstructor(){
        Restaurant testaurant = new Restaurant("Test",1);
        Review testReview = new Review("Test body.","Test Author",3);
        Review testReviewTwo = new Review("Test body.","Test Author",5);
        testaurant.addReview(testReview);
        testaurant.addReview(testReviewTwo);
        String actual = testaurant.name;
        assertEquals("Business name should be 'Test': ","Test",actual);
    }
    @Test
    public void testStringMethodRestaurant(){
        Restaurant testaurant = new Restaurant("Test",1);
        Review testReviewA = new Review("Test review A.","Test Author",1);
        testaurant.addReview(testReviewA);
        String expected = "Business name: Test it has 1.0 stars and a price rating of: 1 Reviews: [Review body: \"Test "
                + "review A.\" Written by: Test Author who gave 1 stars.]";
        System.out.println(testaurant.toString());
        assertEquals("Testing string output",expected,testaurant.toString());

    }

}