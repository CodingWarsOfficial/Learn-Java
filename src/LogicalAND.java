/**
 * Demonstrates the use of Logical AND (&&) operator in Java.
 *
 * @author Coding Wars
 */
public class LogicalAND {
    public static void main(String[] args) {

        // Store the person's age
        int age = 20;

        // Check whether the person has an ID
        boolean hasId = true;

        // Logical AND (&&) returns true only when both conditions are true
        if (age >= 18 && hasId) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("Entry Not Allowed");
        }
    }
}