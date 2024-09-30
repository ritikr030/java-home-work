package loop;

import java.util.Scanner;

public class _12count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your number: ");
        int n = input.nextInt();

        System.out.print("enter your number: ");
        int n2 = input.nextInt();

        int count=n2-n-1;
        System.out.print("result=");
        System.out.println(count);



    }
}
