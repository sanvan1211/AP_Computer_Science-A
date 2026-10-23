/* 
AVLI AP CS-A
Lab report for Dates 
Sanhith Vandara 
October 22 2023

Pseudocode:
    if year1 is not equal to year2
        return (year1 > year2)
    if month1 is not equal to month2
        return (month1 > month2)
    return (day1 > day2)
 
  Reference(s):
    Lab handout (Dates problem, Chapter 6 Question 14) and the provided Dates.java starter file. No other sources or outside help were used.

*/
//import scanner 
import java.util.Scanner;

public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
 
    System.out.print("Enter the first date  (month day year): ");
    int month1 = kb.nextInt();
    int day1 = kb.nextInt();
    int year1 = kb.nextInt();
 
    System.out.print("Enter the second date (month day year): ");
    int month2 = kb.nextInt();
    int day2 = kb.nextInt();
    int year2 = kb.nextInt();
 
    kb.close();
 
    System.out.println(); //prints nothing (ln)
 
    String msg = month1 + "/" + day1 + "/" + year1;
    if (isLater(month1, day1, year1, month2, day2, year2))
      msg += " IS ";
    else
      msg += " is NOT ";
    msg += "later than " + month2 + "/" + day2 + "/" + year2;
    System.out.println(msg);
  }



/*  Post-lab reflection: 

This lab showed me how to compare multi-part values by checking the most significant part first and returning as soon as the answer is known. The easy part was writing the three comparisons. The part that needed care was making sure equal dates return false and that the day is never compared before the month and year are known to be equal. A common mistake is to test each field separately (year1 > year2 || month1 > month2 || day1 > day2), which gives wrong answers like 1/20/2023 vs 5/1/2024. I liked that the problem was small but still required thinking about edge cases. A suggestion would be to add a follow-up that validates dates, for example rejecting a month of 13 or higher 

*/
