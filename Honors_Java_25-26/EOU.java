/*Sanhith Vandara 
Mrs. Scullin 
End of Unit 
Honors CS */ 

import java.util.ArrayList;

public class PrimeDirective {

  public boolean isPrime(int number) {

    // if else 
    if (number == 2) {
      return true;
    } else if (number < 2) {
      return false;
    }

    //for loop 
    for (int i = 2; i < number; i++) {
      // if statement
      if (number % i == 0) {
        return false; // Found a factor, so it's not prime.
      }
    }
    return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    // Initialize an empty ArrayList to store our results.
    ArrayList<Integer> primes = new ArrayList<>();

    // Use a for-each loop to check every element in the input array.
    for (int number : numbers) {
      // Call our isPrime helper method for each number.
      if (isPrime(number)) {
        primes.add(number); // Add to list if the method returns true.
      }
    }

    return primes;
  }

  public void printFibonacci() {
    ArrayList<Integer> fibonacci = new ArrayList<>();

    // The sequence must start with 0 and 1.
    fibonacci.add(0); // Index 0
    fibonacci.add(1); // Index 1

    // Loop starts at index 2 because we already have the first two numbers.
    for (int i = 2; i < 10; i++) {
      // Calculate the next number by adding the two previous numbers in the list.
      int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
      fibonacci.add(next);
    }

    System.out.println("First 10 Fibonacci numbers:");
    System.out.println(fibonacci);
  }

  public static void main(String[] args) {
    // Instantiate the class to access non-static methods.
    PrimeDirective pd = new PrimeDirective();

    // Input array for testing.
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    // 
    System.out.println("Is 7 prime? " + pd.isPrime(7));
    System.out.println("Is 28 prime? " + pd.isPrime(28));

    // filter the array for primes.
    System.out.println("\nPrime numbers in array:");
    System.out.println(pd.onlyPrimes(numbers));

    //Fibonacci sequence.
    System.out.println("");
    pd.printFibonacci();
  }
}
