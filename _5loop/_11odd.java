package loop;

import java.util.Scanner;

public class _11odd {    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("enter your number: ");
    int n = input.nextInt();



    System.out.println("odd numbers are:");
    for (int i = 1; i <= n; i++) {
        if(i%2!=0){
            System.out.println(i);
        }

    }



}
}
