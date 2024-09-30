package loop;

import java.util.Scanner;

public class _22palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your number: ");
        int n = input.nextInt();

        int a=n;

        int rem=0,rev=0;

        while(n>0){

            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }

        if(rev==a){
            System.out.println("pallindrome");
        }else{
            System.out.println("not pallindrome");
        }


    }
}
