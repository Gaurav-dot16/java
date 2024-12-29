import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a, b,c;
        System.out.print("enter the value of a: ");
         a=in.nextInt();
         System.out.print("enter the value of b: ");
         b=in.nextInt();
         System.out.print("enter the value of c: ");
         c=in.nextInt();
         int max= a;
         if(b>max){
        max=b;
         }
         if(c>max){
            max=c;
         }
         System.out.print(max);
         in.close();
    }
    
}
