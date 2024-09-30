package patern;

import java.util.Scanner;

public class _7revtri {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("enter your number: ");
        int n=in.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=2;j<=i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=n+1-i;j++){
                System.out.print('*');
            }


            System.out.println(' ');
        }






    }


}
