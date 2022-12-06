package day09;
import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// reading Keyboard inputs
        System.out.println("Enter your number:");

        int num=input.nextInt();
        if (num%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }



    }
}
