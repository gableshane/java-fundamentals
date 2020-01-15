package inheritence;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Theater {

    String name;
    ArrayList<String> movies;
    Review reviews;

    public Theater(String name){
        this.name = name;
        this.movies = new ArrayList<>();
    }
    public void addMovie(String movie){
        this.movies.add(movie);
    }
    public void removeMovie(String movie){
        this.movies.remove(movie);
    }
    public String toString(){
        String movies = this.movies.toString();
        Review r = this.reviews;
        StringJoiner reviews = new StringJoiner(":","\n[Review]: ","]");
        if(this.reviews == null){
            reviews = reviews.add("No results");
        }
        if(this.movies.isEmpty()){
            this.movies.add("No showings");
            movies = this.movies.toString();
        }
        while(r != null){
            System.out.println(r);
            reviews.add(r.toString());
            r = r.next;
        }
        String result = "Theater name: " + this.name + "\nNow playing: " + movies + "\n--REVIEWS--" + reviews;
        return result;
    }
    public void addReview(Review review){
        review.next = this.reviews;
        this.reviews = review;
        review.business = this.name;
        review.theaterPointer = this;
    }
}
