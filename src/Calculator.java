import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Simple Calculator program.
        Scanner sc = new Scanner(System.in); // Scanner Object

        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator!");
        }

        sc.close();
    }
}