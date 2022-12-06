package day16continueLoop;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String u,p;
        int attempt =3;

        do {
            System.out.println("Enter your /username");
            u = input.next();

            System.out.println("Enter the password");
            p = input.next();
            attempt--;
            if (attempt==0){
                break;
            }

        }    while (!(u.equals("cydeo") && p.equals("WoodenSpoon")) );




    }
    }


