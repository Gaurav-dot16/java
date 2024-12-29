import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: User enters a number
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = 0;
        int temp = originalNumber;

        // Reverse the number using a while loop
        while (temp != 0) {
            int lastDigit = temp % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;  // Build reversed number
            temp = temp / 10;  // Remove the last digit from temp
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close(); // Close scanner to avoid resource leaks
    }
}
