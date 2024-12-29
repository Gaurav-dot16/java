import java.util.Scanner;
public class reverse {

    public static void main(String[] args){
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=in.nextInt();

        int rev=0;  //declare the reverse 0 innitaially
        while(num>0){
            int rem=num%10;     //suppose num =12345; rem =5;4;;3;2;1;
            num/=10;            
            rev=rev*10+rem;     // rev = 0*10+5=5;0*10+4,0*10+3......
        }
        System.out.print("Reverse of the number is : ");
        System.out.println(rev);        //reverse is 54321;
        in.close();
        
    }
}
