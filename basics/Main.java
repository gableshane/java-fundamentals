import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    System.out.println("Works");
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(3);
    clock();
  }
  public static String pluralize(String word , int num) {
    if (num > 1 || num == 0) {
      return word + "s";
    } else {
      return word;
    }
  }
  public static void flipNHeads(int num) {
    int counter = 0;
    while (counter < num) {
      double flip = Math.random();
      if (flip > .5) {
        counter++;
        System.out.println("heads");
      } else {
        System.out.println("tails");
      }
    }
    String output = String.format("It took %d flips to flip %d heads in a row", counter, num);
    System.out.println(output);
  }
  public static void clock() {
    int current = LocalDateTime.now().getSecond();
    while (true) {
      if (current + 1 == LocalDateTime.now().getSecond()) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        String result = String.format("%d:%d:%d",hour,minute,second);
        System.out.println(result);
        current = second;
      }
    }
  }
}
