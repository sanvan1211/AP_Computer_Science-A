/*
AVLI AP CSA 
Sanhith Vandara 
Book Publishing Lab 
Oct 22 2026



Pseudocode:
    total = bp + nb
    if total >= 12
        return total * 16.00
    else if total >= 3
        return total * 16.95
    else
        pairs = smaller of bp and nb
        return pairs * 39.95 + (bp - pairs) * 20.95
                             + (nb - pairs) * 21.95
							 
*/

import java.util.Scanner;
 
public class Publishing {
	//class variables
	static final double BP=20.95;   // "be Prepared" (problem says $20.95; starter file had 21.95)
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

/*
reflection: 
I learned how to turn a word problem with several overlapping *   specials into ordered if / else if checks. The easy part was the *   quantity deals, since they depend only on the total number of *   copies. The harder part was deciding where the pair deal fits. *   Working out that it only matters below 3 copies made the code *   much simpler. I also noticed that the starter file lists the *   price of "Be Prepared" as 21.95, but the problem says $20.95, so *   I used the problem statement's price. I liked that the problem is *   like real online store pricing. A suggestion would be to also ask *   students to reject negative quantities.
*/


