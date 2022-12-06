package day16continueLoop;

import java.util.Scanner;

public class OddorEve {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.println("enter the number");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("Would you like to enter another number ? Yes/No");
            String answer = input.next();
            while (!(answer==("yes")) ||(answer== ("no") )){
                System.err.println("invalid entry,would you like to enter another number");
                answer= input.next().toLowerCase();
            }
            if (answer.equals("no")){
                break;
            }

        }

    }
}
