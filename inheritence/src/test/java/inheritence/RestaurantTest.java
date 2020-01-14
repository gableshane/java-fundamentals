package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testRestaurantConstructor(){
        Restaurant testaurant = new Restaurant("Test","$");
        Review testReview = new Review("Test body.","Test Author",3);
        Review testReviewTwo = new Review("Test body.","Test Author",5);
        testaurant.addReview(testReview);
        testaurant.addReview(testReviewTwo);
        String actual = testaurant.name;
        assertEquals("Restaurant name should be 'Test': ","Test",actual);
    }
    @Test
    public void testStringMethodRestaurant(){
        Restaurant testaurant = new Restaurant("Test","$");
        Review testReview = new Review("Test review.","Test Author",1);
        testaurant.addReview(testReview);
        String expected = "Restaurant name: Test it has 1.0 stars and a price rating of: $";
        assertEquals("Testing string output",expected,testaurant.toSillyString());

    }

}