import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num, t = 1, value;
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for a positive number
        System.out.println("Enter any positive number:");
        num = input.nextInt();
        
        // Display the multiplication table
        System.out.println("The table of the number " + num + ":");
        while (t <= 10) {
            value = num * t;
            System.out.println(num + " x " + t + " = " + value);
            t++;
        }

        // Close the scanner to avoid resource leak
        input.close();
    }
}
