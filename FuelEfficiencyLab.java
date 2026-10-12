import java.util.Scanner;

public class FuelEfficiency
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Gallons of gas in the tank: ");
        double gallons = input.nextDouble();

        System.out.print("Fuel efficiency (miles per gallon): ");
        double mpg = input.nextDouble();

        System.out.print("Price of gas per gallon: $");
        double pricePerGallon = input.nextDouble();

        double gallonsPer100Miles = 100 / mpg;
        double costPer100Miles = gallonsPer100Miles * pricePerGallon;
      
        double milesLeft = gallons * mpg;
      
        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with the gas in the tank.%n", milesLeft);
    }
}

/*
# Lab Report for Fuel Efficiency

**Programmer Name:** Sanhith Vandara

Arrupe Virtual Learning Institute – AP Computer Science

## Assignment Analysis and Design

**Problem Description:** Write a program that asks the user for the gallons of gas in the tank, the car's fuel efficiency in miles per gallon, and the price of gas per gallon. Then print the cost per 100 miles and how far the car can go on the gas in the tank.

**Input(s):** Three decimal numbers typed by the user, read with a `Scanner`: gallons in the tank, miles per gallon (mpg), and price per gallon.

**Output(s):** Two lines of text: the cost per 100 miles and the number of miles the car can go, both rounded to 2 decimal places.

**How it works:** Driving 100 miles uses `100 / mpg` gallons, so the cost per 100 miles is that number times the price per gallon. The distance the car can go is the gallons in the tank times the mpg. I used `double` for every variable since gallons, mpg, and prices are not always whole numbers, and `printf` with `%.2f` to round the output.

**Pseudocode:**

1. Ask for gallons in the tank, mpg, and price per gallon, and store them
2. `gallonsPer100Miles = 100 / mpg`
3. `costPer100Miles = gallonsPer100Miles * pricePerGallon`
4. `milesLeft = gallons * mpg`
5. Print `costPer100Miles` and `milesLeft` rounded to 2 decimal places

**Reference(s):** "Fuel Efficiency" assignment handout.

## Assignment Code

Submitted with this report as `FuelEfficiency.java`.

## Assignment Testing

I ran the program with several inputs and checked each answer by hand with a calculator:

| Input (gallons, mpg, price) | Expected (cost per 100 mi, range) | Program output |
|--------------------|--------------------|--------------------|
| 10, 25, $3.50 | $14.00, 250 mi | $14.00, 250.00 mi |
| 12.5, 30, $4.00 | $13.33, 375 mi | $13.33, 375.00 mi |
| 5, 20, $3.25 | $16.25, 100 mi | $16.25, 100.00 mi |
| 15.2, 28.5, $3.799 | $13.33, 433.2 mi | $13.33, 433.20 mi |
| 0, 25, $3.50 | $14.00, 0 mi | $14.00, 0.00 mi |

All of the outputs matched my hand calculations, including the empty tank, which correctly gives 0 miles.

## Assignment Evaluation

I learned why `double` is the right type for this kind of problem, and how `printf` with `%.2f` rounds money to two decimal places. The easy part was the math, since both formulas are short. The part I had to think about was the cost per 100 miles, because it needs the gallons used for 100 miles first (`100 / mpg`) and then the price. I liked that this program is something useful in real life. To improve it, I would check that mpg is not zero or negative, since dividing by zero would give a bad result.
*/
