import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    int intYear = Integer.parseInt(c.readLine("Enter a year to find out if it's a leap year: "));
    LeapYear leapYear = new LeapYear();
    if(leapYear.isLeapYear(intYear)) {
      System.out.println("Your year is a leap year!");
    } else {
      System.out.println("Your year is not a leap year...");
    }
  }
}
