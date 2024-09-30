package patern;

import java.util.Scanner;

public class _8proper_tri {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("enter your number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 2; j <= i + 1; j++) {
                System.out.print("#");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println(' ');
        }


    }

}






