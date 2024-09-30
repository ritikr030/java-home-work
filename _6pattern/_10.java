package patern;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.println("enter your number: ");
        int n=in.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print("*");

            }

            System.out.println(" ");
        }

        for(int i=1;i<=n;i++){
            for(int j=2;j<=n+1-i;j++){
                System.out.print("*");

            }
            System.out.println(" ");
        }


    }
}
