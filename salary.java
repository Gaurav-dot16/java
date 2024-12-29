import java.util.Scanner;
public class salary{
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
         int salary=25000;
         if(salary>=20000){
            System.out.println(salary+2000);
         }
         else{
            System.out.println(salary);
         }
         in.close();
    }
    
}
