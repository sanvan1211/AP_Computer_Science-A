/*
AVLI AP CS-A
Lab report for Currency Combo
Sanhith Vandara

Pseudocode:
    method printCombinations(cents)
        for quarters from 0 up to cents / 25
            leftAfterQuarters = cents - quarters * 25
            for dimes from 0 up to leftAfterQuarters / 10
                leftAfterDimes = leftAfterQuarters - dimes * 10
                for nickels from 0 up to leftAfterDimes / 5
                    pennies = leftAfterDimes - nickels * 5
                    print quarters, dimes, nickels, pennies

  Reference(s):
    Lab handout (Currency Combo).
*/

import java.util.Scanner;

public class CurrencyCombo
{
    /**
     * prints every way to make the given amount (in cents) using
     * quarters, dimes, nickels, and pennies
     */
    public static void printCombinations(int cents)
    {
        for (int quarters = 0; quarters <= cents / 25; quarters++)
        {
            int leftAfterQuarters = cents - quarters * 25;
            for (int dimes = 0; dimes <= leftAfterQuarters / 10; dimes++)
            {
                int leftAfterDimes = leftAfterQuarters - dimes * 10;
                for (int nickels = 0; nickels <= leftAfterDimes / 5; nickels++)
                {
                    // whatever is left must be paid in pennies
                    int pennies = leftAfterDimes - nickels * 5;
                    System.out.println(cents + " cents = " + quarters + " quarters + "
                            + dimes + " dimes + " + nickels + " nickels + "
                            + pennies + " pennies");
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in cents: ");
        int cents = input.nextInt();
        input.close();

        System.out.println();
        printCombinations(cents);
    }
}


/*  Post-lab reflection:

This lab showed me how nested loops can list every possible combination of several choices. Each loop handles one coin (quarters, then dimes, then nickels), and the upper limit of each loop is however many of that coin still fit in the amount that is left. The key idea was that pennies never need their own loop, because after the other three coins are chosen the pennies are just the remainder. The easy part was writing the loops once I saw that pattern. The part that needed care was recalculating the amount left after each coin so the loop limits stayed correct, and making sure the loops start at 0 so that combinations with none of a coin are included. To test it, I checked that 30 cents gives 18 combinations and $1.00 gives 242, matching the numbers in the handout, and I also tried 0, 1 and 5 cents as edge cases. I also confirmed that every line adds back up to the original amount with no repeats. I liked that the handout gave counts to check against. A suggestion would be to add a follow-up that also counts the combinations or asks for the fewest coins needed.

*/
