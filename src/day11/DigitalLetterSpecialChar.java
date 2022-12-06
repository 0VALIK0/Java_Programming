package day11;

import java.util.Scanner;

public class DigitalLetterSpecialChar {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first= input.nextLine();

        System.out.println("Enter the second string: ");
        String second= input.nextLine();
        input.close();

        if (first.length()>second.length()){
            System.out.println("First string is the longest");
        } else if (first.length()<second.length()) {
            System.out.println("Second string is the longest");

        }else {
            System.out.println("Equal");
        }


    }
}
