
/*Sanhith Vandara
Honors Java Pd. 1
Mrs. Scullun*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
     // create object of the class store  
    Store lemonadeStand = new Store ("lemonade",1.5);
    Store coffeeShop = new Store ("cappuchinno", 4.5);
    Store iceCreamShop = new Store ("milkShakes", 3.75);
  
    //print reference data type; alllocated in memory
    System.out.println(lemonadeStand);
    System.out.println(coffeeShop);
    
     //using the dot operator to call the greetCustoemr method. this is passing a parameter 
    coffeeShop.greetCustomer("Lily");
    lemonadeStand.greetCustomer("Colin");
    
    lemonadeStand.increasePrice(1.25);
    
    System.out.println("The total price with tax is" + lemonadeStand.getTax());
    System.out.println("The total price with tax is" + coffeeShop.getTax());
    
    }
  }

public class Store {
  // declare instance variables 
  String productType;
  double price; 
  
  // constructor assigns values to the instance variables 
  public Store(String product, double initialPrice) {
    productType = product; 
    price = initialPrice; 
  }  
  
  // creating method called greetCustomer that does not return anything (void)
  public void greetCustomer(String customer) {
    System.out.println("Welcome to my store, " + customer + "!");
  }

  // create method that passes a price and calculates a new price 
  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
    System.out.println("New price for item $" + price);
  }

  // creating a method not passing a parameter and returns double
  public double getTax() {
    double totalPrice = price + price * 0.06;
    return totalPrice; 
  }

  // toString method built in method that returns a string value 
  public String toString() {
    return "My store sells " + productType + " at a fixed price of $" + price;
  }
}
