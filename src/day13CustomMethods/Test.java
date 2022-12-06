package day13CustomMethods;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        oddnumber(7);


    }
    public static void oddnumber (int n1){

        if (n1% 2== 0){
            System.out.println("false");
        }else {
            System.out.println(n1+" is odd");
        }
        return ;
    }
}
