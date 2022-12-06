package day13CustomMethods;

import java.util.Scanner;

public class Eligiblevote {
    public static void main(String[] args) {

        eligibleToVote(18,true);

    }

    public static void eligibleToVote(int age,boolean citizen){

        if (age>=18 && citizen){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible");
        }

    }
}
