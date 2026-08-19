/* sanhith vandara 
final project- semester 
honors java final */

import java.util.*;

public class Main {

    // MovieTicket class
    static class MovieTicket {

        // instance variable (step1)
        String ticketType; // evening
        int age;
        int numTickets;
        boolean member;
        double totalCost;
        double ticketPrice;

        // constructor (step2)
        public MovieTicket(String ticketType, int age, int numTickets, boolean member) {
            this.ticketType = ticketType;
            this.age = age;
            this.numTickets = numTickets;
            this.member = member;

            // input validation (step3)
            if (age <= 0 || numTickets <= 0 ||
               (!ticketType.equals("Matinee") && !ticketType.equals("Evening"))) {

                System.out.print("Error: Invalid Ticket Information");
                totalCost = 0;
                return;
            }

            // determine base ticket price (step4)
            if (ticketType.equals("Matinee")) {
                ticketPrice = 8.00;
            } else {
                ticketPrice = 12.00;
            }

            // complex conditional (step5/extra credit)
            if (ticketType.equals("Evening") &&
               (age < 16 || numTickets >= 4)) {
                ticketPrice += 5.00;
            }
        }

        // calculate total cost (Step 6)
        public void calculateTotalCost() {
            totalCost = ticketPrice * numTickets;

            if (member) {
                totalCost -= 2.00;
            }

            System.out.println("total cost: $" + totalCost);
        }
    }

        // create objects (step7)
        MovieTicket t1 = new MovieTicket("Matinee", 10, 2, false);
        t1.calculateTotalCost();

        MovieTicket t2 = new MovieTicket("Evening", 30, 1, true);
        t2.calculateTotalCost();

        MovieTicket t3 = new MovieTicket("Evening", 15, 4, false);
        t3.calculateTotalCost();

        MovieTicket t4 = new MovieTicket("Late Night", 16, 3, false);
        t4.calculateTotalCost();

        MovieTicket t5 = new MovieTicket("Early Night", 17, 3, false);
        t5.calculateTotalCost();
    }
}
