package loop;

import java.util.Scanner;

public class _17table {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your number: ");
        int b = input.nextInt();


        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            mul = i * b;
            System.out.println(mul);
        }


    }
}
