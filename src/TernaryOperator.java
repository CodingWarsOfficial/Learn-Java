/**
 * Demonstrates the use of Ternary Operator (?:) in Java.
 *
 * @author Coding Wars
 */
public class TernaryOperator {
    public static void main(String[] args) {

        // Store the person's age
        int age = 20;

        // Use the ternary operator to check whether the person is an adult
        String result = (age >= 18) ? "Adult" : "Not Adult";

        // Display the result
        System.out.println(result);
    }
}