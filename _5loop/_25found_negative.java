package loop;
import java.util.Scanner;
public class _25found_negative {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        while(true){
            System.out.print("enter your number: ");
            int n=in.nextInt();

            if(n<0){
                System.out.println("found a negative number");
                break;
            }

        }








    }
}
