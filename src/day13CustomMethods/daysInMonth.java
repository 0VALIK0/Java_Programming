package day13CustomMethods;

import java.util.Scanner;

public class daysInMonth {

    public static void main(String[] args) {
        System.out.println("Enter the month number");

        int month =new Scanner((System.in)).nextInt();
        System.out.println("Enter the month number");

        if (month>12 || month<0){
            System.out.println("Invalid number");
            return;
        }


        switch (month){

            case 2:
                System.out.println("28 days");
            case 4: case 6: case 9: case 11:
                System.out.println("30days");

            default:
                System.out.println("31 days");


        }



    }
}
