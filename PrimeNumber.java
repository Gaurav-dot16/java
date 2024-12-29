import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
    int num ;
    int i =2;
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the number : " );
    num=in.nextInt();
    while(i<=num/2){
        if(num%i==0){
            System.out.println("number is not prime ");
            System.exit(0);
        }
   i++;
    }
        System.out.println("number is prime ");
    
    in.close();

    }
    
}
