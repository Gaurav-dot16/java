import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
