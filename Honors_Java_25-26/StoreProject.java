
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
