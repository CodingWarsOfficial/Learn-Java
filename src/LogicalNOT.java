/**
 * Demonstrates the use of Logical NOT (!) operator in Java.
 *
 * @author Coding Wars
 */
public class LogicalNOT {
    public static void main(String[] args) {

        // Store the current weather condition
        boolean isRaining = false;

        // Logical NOT (!) reverses the Boolean value
        // false becomes true and true becomes false
        if (!isRaining) {
            System.out.println("You can go outside.");
        } else {
            System.out.println("Take an umbrella.");
        }
    }
}