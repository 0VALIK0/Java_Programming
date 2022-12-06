package day16continueLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String u= input.next();
        System.out.println("Enter your password");
        String p=input.next();
        if (u.equals("Cydeo")&& p.equals("WoodenSpoon")) {

        System.out.println("Logged in");
        }else {
            for (int i = 0; i < 3; i++) {
                System.err.println("Invalid username and password,please re-enter");
                System.out.println("Enter your username");
                u=input.next();

                System.out.println("Enter your password");
                p=input.next();
                if (u.equals("Cydeo")&& p.equals("WoodenSpoon")) {

                    System.out.println("You are now logged inLogged in");
                    break;
            }

        }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon")   )){
                System.err.println("Your account now is locked");}
        }



    }
}
