public class TypeCastingDemo {
    public static void main(String[] args) {

        // ==============================
        // Implicit Type Casting (Widening)
        // ==============================
        int number = 100;
        double doubleNumber = number; // int -> double

        System.out.println("===== Implicit Type Casting =====");
        System.out.println("Original int value    : " + number);
        System.out.println("Converted double value: " + doubleNumber);

        // ==============================
        // Explicit Type Casting (Narrowing)
        // ==============================
        double price = 99.99;
        int intPrice = (int) price; // double -> int

        System.out.println("\n===== Explicit Type Casting =====");
        System.out.println("Original double value : " + price);
        System.out.println("Converted int value   : " + intPrice);
    }
}