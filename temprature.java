import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the temprature: ");

        float tempC=in.nextFloat();

        float tempF=(tempC*9/5)+32;
        System.out.println(tempF);
        in.close();
    }

}
