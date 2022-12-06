package day09;

import java.util.Scanner;
public class EligibleNotEl {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);// reading Keyboard inputs
            System.out.println("Enter your age:");

            int num=input.nextInt();
            if (num>=21){
                System.out.println("Eligible to buy alcohol!");
            }else{
                System.out.println("Not Eligible to buy alcohol");
            }



        }
    }


