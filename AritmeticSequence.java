
//sanhith vandara 
//ap csa 

import java.util.Scanner;
public class ArithmeticSequence
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer under 10: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i > 1)
            {
                System.out.print(" + ");
            }
            System.out.print(i);
            sum += i;
        }
        System.out.println(" = " + sum);
        input.close();
/*
Artihmetic Sequence 

PROBLEM DESCRIPTION:
  Ask the user for a positive integer under 10 and print the sequence
  1 + 2 + ... + n followed by its sum, in exactly the format shown in the
  assignment (e.g., "1 + 2 + 3 + 4 + 5 + 6 = 21").

INPUT: One integer n, where 1 <= n <= 9.
OUTPUT: A single line listing 1 through n separated by " + ", then " = "
        and the sum.

HOW IT WORKS:
  A for loop counts from 1 to n. Each pass adds the current number to a
  running total and prints it. A " + " is printed before every number
  except the first, so there is no extra plus sign at the start or end.
  After the loop, " = " and the total are printed. For n = 1 the output is
  "1 = 1".

PSEUDOCODE:
  READ n
  sum = 0
  FOR i = 1 TO n
      IF i > 1 THEN PRINT " + "
      PRINT i
      sum = sum + i
  PRINT " = " and sum

REFERENCES: Assignment handout "Arithmetic Sequence." No outside help used.

TESTING: Compiled and ran with every valid input (1 through 9) and compared
  each line to the expected format and to the formula n(n + 1) / 2. All
  matched.
    Input 1 -> 1 = 1
    Input 2 -> 1 + 2 = 3
    Input 6 -> 1 + 2 + 3 + 4 + 5 + 6 = 21 (matches the sample)
    Input 9 -> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45

EVALUATION:
  I practiced using a for loop with a running total to build a formatted
  line of output. The sum was easy. The tricky part was the formatting:
  printing the " + " only between numbers so there is no extra plus sign
  at the end. I solved it by printing the plus before every number except
  the first. Checking the output against n(n + 1) / 2 gave me an easy way to
  confirm the sums were right. I liked that the output had to match
  exactly, since it made me pay attention to spacing. A possible
  improvement would be re-asking the user when the number is not between 1
  and 9.
  
*/
      
    }
}
