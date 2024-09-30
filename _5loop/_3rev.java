package loop;
import java.util.Scanner;
public class _3rev {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("enter your number: ");
        int n=input.nextInt();

        for(int i=n;i>=1;i--){
            System.out.println(i);
        }

    }

}
