package loop;
import java.util.Scanner;

public class _16basePOwer {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("enter your base: ");
        int b=input.nextInt();

        System.out.println("enter your power: ");
        int p=input.nextInt();

        int mul=1;

        for(int i=1;i<=p;i++){
            mul=mul*b;
        }

        System.out.println(mul);



    }
}
