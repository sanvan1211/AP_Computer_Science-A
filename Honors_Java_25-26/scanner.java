/*Sanhith Vandara 
Honors Java pd1
Mrs. Scullin
11_7_25*/

//import java.util and scanner 
import java.util.*;
import java.util.Scanner;

//create public classs 
public class Main {
    public static void main(String[] args) {
      //uses scanner to find the number of 
      Scanner input = new Scanner (System.in);
      //prints the age of dog 
      System.out.println("This code finds the age of the dog");
      
      //int variable for number of age
      int years = input.nextInt();
      //calculation for dog age 
      int dogAge = years * 7;
      // print dog age after cacluation 
      System.out.println("Age: " + dogAge);
      
    }
}
