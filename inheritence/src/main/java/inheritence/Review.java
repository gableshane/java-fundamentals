package inheritence;

public class Review {

    String body;
    String author;
    int stars;
    String business;
    Business businessPointer;
    Review next;
    String movie;

    public Review(String body, String author, int stars){

        this.body = body;
        this.author = author;
        this.stars = stars;

    }
    public Review(String body, String author, int stars, String movie){

        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;

    }
    public String toString(){
        String result = "Review body: \"" + this.body + "\" Written by: " + this.author + " who gave " + this.stars +
                " stars.";
        if(this.movie != null){
            result = "Review body: \"" + this.body + "\" Written by: " + this.author + " who gave " + this.stars +
                    " stars." + " Movie: " + this.movie;
        }
        return result;
    }
}
