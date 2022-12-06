package day11;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUdername= "Cydeo",
        correctPassword="WoodenSpoon";

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your username");
        String username= input.nextLine();

        System.out.println("Enter your pssword");
        String pass=input.nextLine();

        input.close();
        if (username.equals(correctUdername) && pass.equals(correctPassword)){
        System.out.println("You are now logged in");}
        else {
            System.out.println("Incorrect username or password.Please try again");
        }








    }
}
