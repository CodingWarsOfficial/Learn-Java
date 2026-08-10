/**
 * Electricity Bill Program
 *
 * @author Coding Wars
 */

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        // Scanner object for taking input
        Scanner input = new Scanner(System.in);

        // Taking electricity units from the user
        System.out.print("Enter electricity units: ");
        int units = input.nextInt();

        /*
         * Relational Operators:
         *
         * Checking whether the units are within
         * the first billing range.
         */
        boolean lowUsage = units <= 100;

        /*
         * Relational Operators:
         *
         * Checking whether the units are between
         * 101 and 200.
         */
        boolean mediumUsage = units > 100 && units <= 200;

        /*
         * Logical OR Operator:
         *
         * Checks whether the user has consumed
         * 200 units or less.
         */
        boolean normalUsage = lowUsage || mediumUsage;

        /*
         * Ternary Operator:
         *
         * Calculates the bill without using
         * if-else.
         *
         * First 100 units  = ₹5 per unit
         * Next 100 units   = ₹7 per unit
         * Above 200 units  = ₹10 per unit
         */
        double bill = lowUsage
                ? units * 5
                : mediumUsage
                ? (100 * 5) + ((units - 100) * 7)
                : (100 * 5) + (100 * 7) + ((units - 200) * 10);

        /*
         * Unary Operator:
         *
         * ++ increases the bill count by 1.
         */
        int billCount = 0;
        billCount++;

        // Displaying electricity bill
        System.out.println("\n===== ELECTRICITY BILL =====");

        System.out.println("Units Consumed : " + units);
        System.out.printf("Electricity Bill: ₹%.2f%n", bill);

        System.out.println("Bill Generated  : " + billCount);

        // Closing Scanner
        input.close();
    }
}

