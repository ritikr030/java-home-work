package loop;
import java.util.Scanner;
public class _23fibo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter your number: ");
        int n=input.nextInt();

        int i=0;
        int j=1;
        int sum=0;

        for(;i<n;i++){

            System.out.println(sum);

            i=j;
            j=sum;
            sum=i+j;




        }

    }

}
