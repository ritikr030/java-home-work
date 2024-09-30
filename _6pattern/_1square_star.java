package patern;
import java.util.Scanner;
public class _1square_star {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("enter your number: ");
        int n=in.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print('*');
            }
            System.out.println(' ');
        }










    }

}
