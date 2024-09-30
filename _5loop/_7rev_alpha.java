package loop;

import java.util.Scanner;

public class _7rev_alpha {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter your alpha: ");
        char n=input.next().charAt(0);

        char i='a';

        for(;n>=i;n--){

            System.out.println(i);
        }






    }

}
