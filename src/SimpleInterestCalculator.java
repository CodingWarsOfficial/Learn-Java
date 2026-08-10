import java.util.Scanner;

/**
 * Simple Interest Calculator
 *
 * Formula:
 * Simple Interest = (Principal × Rate × Time) / 100
 *
 * @author Coding Wars
 */

public class SimpleInterestCalculator {

    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking principal amount from the user
        System.out.print("Enter Principal Amount: ₹");
        double principal = input.nextDouble();

        // Taking rate of interest from the user
        System.out.print("Enter Rate of Interest (%): ");
        double rate = input.nextDouble();

        // Taking time from the user
        System.out.print("Enter Time (years): ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculating total amount
        double totalAmount = principal + simpleInterest;

        // Displaying results
        System.out.println("\n----- Result -----");
        System.out.println("Principal Amount: ₹" + principal);
        System.out.println("Simple Interest: ₹" + simpleInterest);
        System.out.println("Total Amount: ₹" + totalAmount);

        // Closing Scanner
        input.close();
    }
}