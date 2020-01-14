package inheritence;

import java.util.StringJoiner;

public class Restaurant {

    String name;
    String price;
    Review reviews;
    double stars;

    public Restaurant(String name, String price){
        this.name = name;
        this.price = price;
    }
    public String toSillyString(){
        Review r = this.reviews;
        StringJoiner reviews = new StringJoiner(":","[","]");
        while(r != null){
            reviews.add(r.toSillyString());
            r = r.next;
        }
        String result = "Restaurant name: " + this.name + " it has " + this.stars + " stars and a price rating of: " +
                this.price;
        return result + "Reviews: " + reviews;
    }
    public void addReview(Review review){
        review.next = this.reviews;
        this.reviews = review;
        review.restaurant = this.name;
        this.stars = this.getStars();
    }
    public double getStars(){
        Review r = this.reviews;
        int sum = 0;
        int counter = 1;
        if(r.next == null){
            return r.stars;
        }
        while(r.next != null){
            sum += r.stars;
            counter++;
            r = r.next;
        }
        return (sum + r.stars) / counter;
    }
}
