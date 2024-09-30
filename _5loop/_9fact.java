package loop;

import java.util.Scanner;

public class _9fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your number: ");
        int n = input.nextInt();

        int fact=1;

        for (int i = 1; i <= n; i++) {
            fact=fact*i;

        }
        System.out.print("result=");
        System.out.println(fact);

    }
}
