//Sanhith Vandara 
//Mrs. Scullin 
/// H Java pd 1
// 12.6.25

//import scanner 
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
//use scanner 
Scanner scanner = new Scanner(System.in);

    // Get user input for continent selection
    System.out.print("Enter a number 1-7 for a continent: ");
    int choice = scanner.nextInt();

    String continentName = "";
    String largestCity = "";

    //pickcontinent and largest city based on user input
    switch (choice) {
        case 1:
            continentName = "Africa";
            largestCity = "Lagos, Nigeria";
            break;
        case 2:
            continentName = "Asia";
            largestCity = "Tokyo, Japan";
            break;
        case 3:
            continentName = "North America";
            largestCity = "Mexico City, Mexico";
            break;
        case 4:
            continentName = "South America";
            largestCity = "Sao Paulo, Brazil";
            break;
        case 5:
            continentName = "Europe";
            largestCity = "Moscow, Russia";
            break;
        case 6:
            continentName = "Oceania";
            largestCity = "Sydney, Australia";
            break;
        case 7:
            continentName = "Antarctica";
            largestCity = "Random Research Station ";
            break;
        default:
            System.out.println("Invalid input. Enter a number from 1-7.");
  }
  
      // print the selected continent info
    System.out.println(continentName + ": " + largestCity);
  }
}
