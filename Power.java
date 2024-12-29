import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Base and Exponent
        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the exponent (b): ");
        int b = scanner.nextInt();

        // Initialize result to 1 (since a^0 = 1)
        long result = 1;
        int i = 0;

        // Calculate a^b using while loop
        while (i < b) {
            result *= a;
            i++;
        }

        // Output the result
        System.out.println(a + "^" + b + " = " + result);

        scanner.close();  // Close scanner to avoid resource leaks
    }
}
