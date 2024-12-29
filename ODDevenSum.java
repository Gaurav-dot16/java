import java.util.Scanner;

public class ODDevenSum {
    public static void main(String[] args) {
        int n, i , sum =0 ;
        System.out.print("enter the range ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
    if (n%2==0) {
        for(i=0;i<=n;i+=2){

            sum=sum+i;
        }
        System.out.println("sum of even numbers are "  + sum);
    
    }

    else{
        

        for(i=1;i<=n;i+=2)
        sum=sum+i;
        System.out.println("sum of odd numbers are "+ sum);
    }
 
    }
}
