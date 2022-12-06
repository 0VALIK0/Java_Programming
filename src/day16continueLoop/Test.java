package day16continueLoop;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int score = 0;
        System.out.println("entere you score");
        input.next();

        if (!(score>20 || score<1)){
            System.out.println("Score is invalid");

        }else{
            System.out.println("Score is valid");}


    }
}
