import java.util.Scanner;

public class SumofNnumber {
    public static void main(String[] args) {
        int n , sum =0;
        System.out.print("enter the n ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum +i;
        }
        System.out.println("sum of given natural number is " + sum);
    }
}
