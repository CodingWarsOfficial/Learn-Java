/**
 * Bank Loan Eligibility Program
 *
 * @author Coding Wars
 */

import java.util.Scanner;

public class LoanEligibility {

    public static void main(String[] args) {

        // Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking user's age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Taking user's monthly salary
        System.out.print("Enter your monthly salary: ");
        double salary = input.nextDouble();

        // Taking user's credit score
        System.out.print("Enter your credit score: ");
        int creditScore = input.nextInt();

        /*
         * Relational Operators:
         *
         * Age must be between 21 and 60.
         */
        boolean ageEligible = age >= 21 && age <= 60;

        /*
         * Relational Operator:
         *
         * Salary must be at least ₹25,000.
         */
        boolean salaryEligible = salary >= 25000;

        /*
         * Relational Operator:
         *
         * Credit score must be 700 or higher.
         */
        boolean creditEligible = creditScore >= 700;

        /*
         * Logical AND Operator:
         *
         * All three conditions must be true.
         */
        boolean loanEligible = ageEligible && salaryEligible && creditEligible;

        /*
         * Ternary Operator:
         *
         * Displays Eligible or Not Eligible
         * without using if-else.
         */
        String result = loanEligible ? "Loan Eligible" : "Loan Not Eligible";

        /*
         * Unary Operator:
         *
         * ++ increases the value by 1.
         */
        int applicationCount = 0;
        applicationCount++;

        // Displaying the result
        System.out.println("\n===== LOAN ELIGIBILITY =====");

        System.out.println("Age           : " + age);
        System.out.println("Monthly Salary: ₹" + salary);
        System.out.println("Credit Score  : " + creditScore);

        System.out.println("Application   : " + applicationCount);
        System.out.println("Result        : " + result);

        // Closing Scanner
        input.close();
    }
}

