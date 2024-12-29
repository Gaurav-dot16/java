import java.util.Scanner;;
public class loop {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println(i);
    }
    in.close();
    }
}
