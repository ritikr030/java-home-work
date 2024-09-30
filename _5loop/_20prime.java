package loop;

import java.util.Scanner;

public class _20prime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your base: ");
        int n = input.nextInt();

        int i=2;

        for(;i<n;i++){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }
        }

        if(i==n){
            System.out.println("prime");
        }



    }
}
