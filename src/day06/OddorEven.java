package day06;

public class OddorEven {

    public static void main(String[] args) {


       int number=20
               ;
       boolean isEven= number % 2==0 ;
       boolean isOdd= !isEven;
        System.out.println(number + " is an even number: " + isEven );//wehn we divide number by two
        System.out.println(number + " is an odd number: " + isOdd);
    }
}
