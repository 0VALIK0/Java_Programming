package day08;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number=100;
        /*String result="";

        if (number>0) {
            result = "Posetive";
        }else if (number<0) {
            result="Negative";
        }else {
            result = "Zero";
        }

        System.out.println(result);*/

String result= (number>0) ? "Posetive" :(number<0)? "Negative" : "Zero";

        System.out.println(result);
    }


    }

