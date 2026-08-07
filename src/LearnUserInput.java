import java.util.Scanner;

public class LearnUserInput {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); // Scanner Object
        System.out.println("Enter your marks."); // Print message on screen
        int marks = obj.nextInt(); // Taking input from user
        if (marks >= 60){
            System.out.println("First Division.");
        } else if (marks >= 50) {
            System.out.println("Second Division.");
        } else if (marks >= 33) {
            System.out.println("Third Division.");
        }else {
            System.out.println("Fail.");
        }
        obj.close();
    }
}
