package loop;

import java.util.Scanner;

public class _6till_alpha {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter your value: ");
        char ch=input.next().charAt(0);

            char i='a';

        for(;i<=ch;i++){
            System.out.println(i);
        }
    }
}
