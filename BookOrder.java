

import java.util.Scanner;
 
public class Publishing {
	//class variables
	static final double BP=20.95;   // "Be Prepared" (problem says $20.95; starter file had 21.95)
	static final double NB=21.95;   // "Next Best"
	static final double DEALPRICE=39.95;       // one of each together
	static final double QUANTITYDEAL3=16.95;   // each, for 3 or more copies
	static final double QUANTITYDEAL12=16.00;  // each, for 12 or more copies
	static Scanner in=new Scanner(System.in);
 
	public static void main(String[] args) {
		System.out.print("Enter the number of \"Be Prepared\" books: ");
		int bp = in.nextInt();
		System.out.print("Enter the number of \"Next Best\" books: ");
		int nb = in.nextInt();
 
		in.close();
 
		double total = getOrderTotal(bp, nb);
 
		System.out.println();  // blank line
		System.out.printf("Total: $%.2f%n", total);
	}
 
	/**
	 * Returns the total cost of bp copies of "Be Prepared" and
	 * nb copies of "Next Best", applying the best special.
	 */
	public static double getOrderTotal(int bp, int nb) {
		int copies = bp + nb;
 
		// 12 or more copies: $16.00 each, any mix
		if (copies >= 12)
			return copies * QUANTITYDEAL12;
 
		// 3 to 11 copies: $16.95 each, any mix
		if (copies >= 3)
			return copies * QUANTITYDEAL3;
 
		// Fewer than 3 copies: use the pair deal for each matched pair,
		// and charge the regular price for any leftover copies
		int pairs = Math.min(bp, nb);
		return pairs * DEALPRICE + (bp - pairs) * BP + (nb - pairs) * NB;
	}
 
}
