package loop;

import java.util.Scanner;

public class _13avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your number: ");
        int n = input.nextInt();

        System.out.print("enter your number: ");
        int n2 = input.nextInt();

        int sum=0;

        for(int i=n;i<=n2;i++){
            sum=sum+i;
        }

        int count=n2-n+1;

        System.out.println("average:");
        System.out.println(sum/count);

    }
}
