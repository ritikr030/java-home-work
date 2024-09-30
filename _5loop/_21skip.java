package loop;

import java.util.Scanner;

public class _21skip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter your base: ");
        int n = input.nextInt();

        for(int i=0;i<=n;i++){

            if(i%3==0){

                continue;
            }
            System.out.println(i);

        }



    }
}
