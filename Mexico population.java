import java.util.Scanner;

/**
 * Mexico Population
 * Prompts the user for a target population (in millions) and prints the year
 * in which Mexico's population will reach or exceed that number, assuming a
 * constant growth rate of 1.1 percent per year.
 *
 * Programmer: Sanhith Vandara
 */
public class MexicoPopulation
{
    // Constants
    public static final int START_YEAR = 2021;
    public static final double START_POPULATION = 130.3;   // millions
    public static final double GROWTH_RATE = 1.1;          // percent per year

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a target population (in millions): ");
        double target = input.nextDouble();

        int year = START_YEAR;
        double population = START_POPULATION;

        // Grow the population one year at a time until it reaches the target
        while (population < target)
        {
            population = population * (1 + GROWTH_RATE / 100);
            year++;
        }

        System.out.println("The population of Mexico will reach or exceed "
                + target + " million in the year " + year + ".");

        input.close();
    }
}
