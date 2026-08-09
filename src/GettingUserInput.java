import java.util.Scanner;

/**
 * Demonstrates how to get user input from the keyboard in Java.
 *
 * @author Coding Wars
 */
public class GettingUserInput {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's name
        String name = scanner.nextLine();

        // Ask the user to enter their age
        System.out.print("Enter your age: ");

        // Read the user's age
        int age = scanner.nextInt();

        // Display the entered information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Close the Scanner object
        scanner.close();
    }
}