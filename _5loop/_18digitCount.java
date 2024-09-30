package loop;

import java.util.Scanner;

public class _18digitCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your base: ");
        int n = input.nextInt();

        int count =0;

        for(int i=1;i<=n;n=n/10){
            count++;
        }
        System.out.print("result=");
        System.out.println(count);



    }
}
