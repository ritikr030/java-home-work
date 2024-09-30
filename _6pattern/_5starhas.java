package patern;

import java.util.Scanner;

public class _5starhas {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("enter your number: ");
        int n=in.nextInt();

        for(int i=1;i<=n;i++){

            if(i%2==0){

                for(int j=1;j<=n;j++){

                    if(j%2==0){
                        System.out.print("#");
                    }else{
                        System.out.print("*");
                    }
                }

            }else{

                for(int j=1;j<=n;j++){

                    if(j%2==0){
                        System.out.print("*");
                    }else{
                        System.out.print("#");
                    }
                }


            }
            System.out.println(" ");

        }










    }

}


