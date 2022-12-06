package day19_Array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int[] numbers = new int[total];
        int sum=0;

        for (int i = 0; i <total ; i++) {
            System.out.println("Entr the number");
            numbers[i]= input.nextInt();
            sum+= numbers[i];
        }

        System.out.println("Numbers : "+ Arrays.toString(numbers));
        System.out.println("sum " + sum);
    }
}
