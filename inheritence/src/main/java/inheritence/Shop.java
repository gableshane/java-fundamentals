package inheritence;

import java.util.StringJoiner;

public class Shop extends Business{

    String description;

    public Shop(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString(){
        Review r = this.reviews;
        while(this.reviews != null){
            StringJoiner reviews = new StringJoiner(":","\n[Review]: ","]");
            reviews.add(r.toString());
            r = r.next;
            String result = "Shop name: " + this.name + "\nDescription: " + this.description +
                    "\nPrice point: " + this.price + reviews;
            return result;
        }
        String result = "Shop name: " + this.name + "\nDescription: " + this.description +
                "\nPrice point: " + this.price;
        return result;
    }

}
