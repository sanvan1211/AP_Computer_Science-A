/* 
Sanhith Vandara 
Honors Java - Pd. 2 
Mrs. Scullin 
*/

import java.util.Scanner; // import Scanner from Java library

public class RectangleArea {
    public static void main(String[] args) {
        
        System.out.println("This program calculates the area of a rectangle.");

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask for length
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        // Ask for width
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Calculate area
        double area = length * width;

        // Display result
        System.out.println("The area of the rectangle is: " + area);

        // Close scanner
        input.close();
    }
}
