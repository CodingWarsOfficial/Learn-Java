/**
 * Bus Ticket Fare Calculator
 *
 * Fare Rules:
 * 1 km  = ₹10
 * 2 km  = ₹15
 * Above 2 km = ₹5 for every additional kilometer
 *
 * @author Coding Wars
 */

import java.util.Scanner;

public class BusTicketFareCalculator {

    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking travel distance
        System.out.print("Enter travel distance (km): ");
        int distance = input.nextInt();

        // Taking number of tickets
        System.out.print("Enter number of tickets: ");
        int tickets = input.nextInt();

        /*
         * Relational Operators:
         *
         * Checking different distance ranges.
         */
        boolean oneKm = distance == 1;
        boolean twoKm = distance == 2;
        boolean aboveTwoKm = distance > 2;

        /*
         * Logical OR Operator:
         *
         * Checks whether distance is valid.
         */
        boolean validDistance = oneKm || twoKm || aboveTwoKm;

        /*
         * Ternary Operator:
         *
         * Fare calculation:
         *
         * 1 km = ₹10
         * 2 km = ₹15
         * Above 2 km = ₹15 + ₹5 for every extra km
         */
        double fare = oneKm
                ? 10
                : twoKm
                ? 15
                : 15 + ((distance - 2) * 5);

        // Calculate total fare
        double totalFare = fare * tickets;

        /*
         * Unary Operator:
         *
         * ++ increases the ticket counter by 1.
         */
        int ticketCounter = 0;
        ticketCounter++;

        // Displaying ticket details
        System.out.println("\n===== BUS TICKET =====");

        System.out.println("Distance          : " + distance + " km");
        System.out.println("Number of Tickets : " + tickets);

        System.out.printf("Fare Per Ticket   : ₹%.2f%n", fare);
        System.out.printf("Total Fare        : ₹%.2f%n", totalFare);

        System.out.println("Valid Distance    : "
                + (validDistance ? "Yes" : "No"));

        System.out.println("Ticket Counter    : " + ticketCounter);

        // Closing Scanner
        input.close();
    }
}

