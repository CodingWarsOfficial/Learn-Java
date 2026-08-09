/**
 * Demonstrates the use of Logical OR (||) operator in Java.
 *
 * @author Coding Wars
 */
public class LogicalOR {
    public static void main(String[] args) {

        // Store the person's age
        int age = 16;

        // Check whether the person has special permission
        boolean hasPermission = true;

        // Logical OR (||) returns true when at least one condition is true
        if (age >= 18 || hasPermission) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("Entry Not Allowed");
        }
    }
}