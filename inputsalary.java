import java.util.Scanner;

public class inputsalary {
    public static void main (String[] args){
        int salary =25000;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the salary");
      
        if(salary >=30000){
            System.out.println(salary+5000);
        }
        else{
            System.out.println(salary);
        }

in.close();

    }
}
