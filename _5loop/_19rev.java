package loop;

import java.util.Scanner;

public class _19rev {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your number: ");
        int n = input.nextInt();

        int rem=0,rev=0;

        while(n>0){

            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println("rev=");
        System.out.println(rev);

    }
}

