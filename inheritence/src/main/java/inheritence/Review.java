package inheritence;

public class Review {

    String body;
    String author;
    int stars;
    String restaurant;
    Restaurant restaurantPointer;
    Review next;

    public Review(String body, String author, int stars){

        this.body = body;
        this.author = author;
        this.stars = stars;

    }
    public String toSillyString(){
        String result = "Review body: \"" + this.body + "\" Written by: " + this.author + " who gave " + this.stars +
                " stars.";
        return result;
    }
}
