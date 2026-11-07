///sanihith vandara 
//ap csa- mexico population


import java.util.Scanner;

public class MexicoPopulation
{
    // initialize constants
    public static final int START_YEAR = 2021;
    public static final double START_POPULATION = 130.3;   
    public static final double GROWTH_RATE = 1.1;          
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a target population (in millions): ");
        double target = input.nextDouble();

        int year = START_YEAR;
        double population = START_POPULATION;
        while (population < target)
        {
            population = population * (1 + GROWTH_RATE / 100);
            year++;
        }
        System.out.println("The population of Mexico will reach or exceed "
                + target + " million in the year " + year + ".");
        input.close();

        /*


        
    }
}
