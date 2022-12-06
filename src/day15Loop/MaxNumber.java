package day15Loop;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

      int max=-2147483648;


        for (int i = 0;i<5; i++) {

            System.out.println("Enter the number");
            int num= input.nextInt();//10.5.3.20.15
            if (num>max){
                max=num;
            }
        }
        System.out.println("max= "+ max);
    }
}
