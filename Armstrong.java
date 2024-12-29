import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: User enters a number
        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int temp = originalNumber;
        int sum = 0;
        int digits = 0;

        // Calculate the number of digits in the input
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = originalNumber; // Reset temp to the original number

        // Calculate the sum of each digit raised to the power of 'digits'
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }

        // Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close(); // Close scanner to avoid resource leaks
    }
}
