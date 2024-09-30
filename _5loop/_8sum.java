package loop;

import java.util.Scanner;

public class _8sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your number: ");
        int n = input.nextInt();

        int sum=0;

        for (int i = 1; i <= n; i++) {
            sum=sum+i;

        }
        System.out.print("result=");
        System.out.println(sum);

    }
}
