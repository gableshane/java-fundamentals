package inheritence;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest{
    @Test
    public void testShopConstructor(){
        Shop expectedShop = new Shop("Test","A test store.",1);
        assertEquals("Test shop should exist",expectedShop.name,"Test");
    }
    @Test
    public void testShopToString(){
        Shop testShop = new Shop("Test","A test shop.",1);
        String expected = "Shop name: Test\nDescription: A test shop.\nPrice point: 1";
        assertEquals("Testing the toString method has expected output",expected,testShop.toString());
    }
    @Test
    public void testAddReviewShop(){
        Shop testShop = new Shop("Test","A test shop.",1);
        Review testReview = new Review("This is a test review","Test Author",1);
        testShop.addReview(testReview);
        System.out.println(testShop.toString());
    }
    @Test
    public void testShopToStringWithReview(){
        Shop testShop = new Shop("Test","A test shop.",1);
        Review testReview = new Review("This is a test review","Test Author",1);
        testShop.addReview(testReview);
        String expected = "Shop name: Test\nDescription: A test shop.\nPrice point: 1\n[Review]: Review body: \"This is a test review\" Written by: Test Author who gave 1 stars.]";
        assertEquals("Testing the toString method has expected output",expected,testShop.toString());
    }
}