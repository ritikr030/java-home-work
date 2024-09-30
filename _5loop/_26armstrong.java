package loop;
import java.util.Scanner;
public class _26armstrong {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("enter your number: ");
        int n=in.nextInt();

        int count=0;

        for(int i=1;i<=n;n=n/10){

            count++;
        }
        System.out.println("count=");
        System.out.println(count);







    }


}
