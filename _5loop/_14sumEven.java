package loop;

import java.util.Scanner;

public class _14sumEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your number: ");
        int n = input.nextInt();

        System.out.print("enter your number: ");
        int n2 = input.nextInt();

        int sum=0;

        for (int i = n; i <= n2; i++) {
            if (i%2==0){
                sum=sum+i;

            }

        }
        System.out.print("result=");
        System.out.println(sum);

    }
}
