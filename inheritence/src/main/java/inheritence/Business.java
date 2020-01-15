package inheritence;

import java.util.StringJoiner;

public class Business {

    String name;
    int price;
    Review reviews;
    double stars;

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

    public void addReview(Review review){
        review.next = this.reviews;
        this.reviews = review;
        review.business = this.name;
        review.businessPointer = this;
        this.stars = getStars();
    }
    public String toString(){
        Review r = this.reviews;
        StringJoiner reviews = new StringJoiner(":","[","]");
        while(r != null){
            reviews.add(r.toString());
            r = r.next;
        }
        String result = "Business name: " + this.name + " it has " + this.stars + " stars and a price rating of: " +
                this.price + " ";
        return result + "Reviews: " + reviews;
    }
}
