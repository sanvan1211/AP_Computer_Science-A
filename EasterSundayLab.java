import java.util.Scanner;

public class Easter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Ask the user for the year
        System.out.print("Enter a year: ");
        int y = input.nextInt();

        int a = y % 19;                              // remainder of y / 19
        int b = y / 100;                             // quotient of y / 100
        int c = y % 100;                             // remainder of y / 100
        int d = b / 4;                               // quotient of b / 4
        int e = b % 4;                               // remainder of b / 4
        int g = (8 * b + 13) / 25;                   // quotient only
        int h = (19 * a + b - d - g + 15) % 30;      // remainder only
        int j = c / 4;                               // quotient of c / 4
        int k = c % 4;                               // remainder of c / 4
        int m = (a + 11 * h) / 319;                  // quotient only
        int r = (2 * e + 2 * j - k - h + m + 32) % 7; // remainder only
        int n = (h - m + r + 90) / 25;               // quotient only (the month)
        int p = (h - m + r + n + 19) % 32;           // remainder only (the day)

        // easter always lands in March or April, so n will be 3 or 4
        String month;
        if (n == 3)
        {
            month = "March";
        }
        else
        {
            month = "April";
        }

        // print final result
        System.out.println("Easter Sunday in " + y + " is " + month + " " + p);
    }
}


/*
Lab Report: 
# Lab Report for Easter Sunday

**Programmer Name:** Sanhith Vandara
Arrupe Virtual Learning Institute – AP Computer Science

## Assignment Analysis and Design

**Problem Description:** Ask the user for a year, then use Gauss's 1800 algorithm to calculate and print the month and day of Easter Sunday for that year.

**Input(s):** One whole number typed by the user: the year (e.g. 2001), read with a `Scanner`.

**Output(s):** One line of text, e.g. `Easter Sunday in 2001 is April 15`.

**How it works:** I turned each step of the handout into one line of Java, keeping the same variable names (a, b, c, d, e, g, h, j, k, m, n, p, r). Integer division (`/`) gives the quotient and `%` gives the remainder, which is exactly what each step asks for. The month comes out as 3 or 4, so I used an if/else to print "March" or "April".

**Pseudocode:**

1. Ask for a year and store it in `y`
2. Follow Gauss's steps in order, using `/` for quotients and `%` for remainders, to get `a` through `r`
3. `n = (h - m + r + 90) / 25` is the month, `p = (h - m + r + n + 19) % 32` is the day
4. If `n` is 3, month is "March", otherwise "April"
5. Print the year, month, and `p`

**Reference(s):** "Easter Sunday" assignment handout (Gauss's algorithm and the 2001 test case).

## Assignment Code

Submitted with this report as `Easter.java`.

## Assignment Testing

I used the handout's 2001 example, worked each variable out by hand (a = 6, b = 20, c = 1, d = 5, e = 0, g = 6, h = 18, j = 0, k = 1, m = 0, r = 6, n = 4, p = 15), and the program printed April 15, which matches. I also ran other years and compared them to known Easter dates:

| Year | Expected | Output |
|------|----------|--------|
| 2001 | April 15 | April 15 |
| 2024 | March 31 | March 31 |
| 2025 | April 20 | April 20 |
| 2026 | April 5 | April 5 |
| 1800 | April 13 | April 13 |
| 1961 | April 2 | April 2 |
| 2038 | April 25 | April 25 |

## Assignment Evaluation

I learned how integer division and the remainder operator work together, and I practiced the order of operations, since the parentheses matter in steps like `(19 * a + b - d - g + 15) % 30`. The easy part was that the handout lists the steps in order. The tricky part was keeping track of which steps need the quotient and which need the remainder, because mixing them up gives a wrong date with no error. The 2001 example helped me check my work. To improve the project, I would add a loop for multiple years and validate the input.


*/
