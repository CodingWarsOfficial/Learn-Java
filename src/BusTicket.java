/**
 * Bus Ticket Calculator
 *
 * @author Coding Wars
 */

import java.util.Scanner;

public class BusTicket {

    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking passenger age
        System.out.print("Enter passenger age: ");
        int age = input.nextInt();

        // Taking number of tickets
        System.out.print("Enter number of tickets: ");
        int tickets = input.nextInt();

        // Price of one bus ticket
        double ticketPrice = 100;

        /*
         * Relational Operators:
         *
         * Checks whether passenger is a child
         * or a senior citizen.
         */
        boolean child = age < 12;
        boolean seniorCitizen = age >= 60;

        /*
         * Logical OR Operator:
         *
         * Child OR senior citizen gets a discount.
         */
        boolean discountEligible = child || seniorCitizen;

        /*
         * Ternary Operator:
         *
         * Eligible passengers get 50% discount.
         * Other passengers pay the normal price.
         */
        double finalTicketPrice = discountEligible
                ? ticketPrice * 0.50
                : ticketPrice;

        // Calculate total ticket amount
        double totalAmount = finalTicketPrice * tickets;

        /*
         * Unary Operator:
         *
         * ++ increases the ticket counter by 1.
         */
        int ticketCounter = 0;
        ticketCounter++;

        // Displaying bus ticket details
        System.out.println("\n===== BUS TICKET =====");

        System.out.println("Passenger Age     : " + age);
        System.out.println("Number of Tickets : " + tickets);

        System.out.printf("Ticket Price      : ₹%.2f%n", ticketPrice);
        System.out.printf("Final Ticket Price: ₹%.2f%n", finalTicketPrice);
        System.out.printf("Total Amount      : ₹%.2f%n", totalAmount);

        System.out.println("Discount Applied  : "
                + (discountEligible ? "Yes" : "No"));

        System.out.println("Ticket Counter    : " + ticketCounter);

        // Closing Scanner
        input.close();
    }
}
