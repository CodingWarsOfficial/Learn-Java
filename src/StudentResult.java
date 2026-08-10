/**
 * Student Result Program
 *
 * @author Coding Wars
 */

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        // Scanner object for taking input from the user
        Scanner input = new Scanner(System.in);

        // Taking Physics marks
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        // Taking Chemistry marks
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        // Taking Mathematics marks
        System.out.print("Enter Mathematics marks: ");
        int mathematics = input.nextInt();

        // Total number of subjects
        int subjects = 3;

        // Calculating total marks
        int total = physics + chemistry + mathematics;

        // Calculating percentage
        double percentage = total / (double) subjects;

        /*
         * Relational Operator:
         * Checks whether percentage is greater than
         * or equal to 40.
         */
        boolean percentagePass = percentage >= 40;

        /*
         * Logical AND Operator:
         * All three subjects must have marks
         * greater than or equal to 40.
         */
        boolean allSubjectsPass = physics >= 40 && chemistry >= 40 && mathematics >= 40;

        /*
         * Logical AND Operator:
         * Student passes only when both conditions
         * are true.
         */
        boolean result = percentagePass && allSubjectsPass;

        /*
         * Ternary Operator:
         * Displays PASS or FAIL without using if-else.
         */
        String status = result ? "PASS" : "FAIL";

        /*
         * Unary Operator:
         * ++ increases the value by 1.
         *
         * This is only used to demonstrate
         * the Unary Operator.
         */
        int counter = 0;
        counter++;

        // Displaying the result
        System.out.println("\n===== STUDENT RESULT =====");

        System.out.println("Physics     : " + physics);
        System.out.println("Chemistry   : " + chemistry);
        System.out.println("Mathematics : " + mathematics);

        System.out.println("Subjects    : " + subjects);
        System.out.println("Total Marks : " + total);
        System.out.printf("Percentage  : %.2f%%%n", percentage);
        System.out.println("Result      : " + status);

        // Closing Scanner
        input.close();
    }
}

