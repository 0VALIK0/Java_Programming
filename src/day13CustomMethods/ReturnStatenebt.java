package day13CustomMethods;

import java.util.Scanner;

public class ReturnStatenebt {


    public static void main(String[] args) {


        char grade = new Scanner(System.in).next().charAt(0);
        boolean isvalid= grade=='A' || grade=='B' || grade=='C' || grade=='D'|| grade=='F';
if (!isvalid){
    System.out.println("Invalid grade");
return;
}
        System.out.println(  (grade=='A')?"Excellent":(grade=='B') ? "Grat Job":(grade=='C')?"Good"
                :(grade=='D')? "Pass":"Failed");
    }
}
