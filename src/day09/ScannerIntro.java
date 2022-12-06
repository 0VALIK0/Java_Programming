package day09;
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);// reading Keyboard inputs
        System.out.println("Enter the first number:");
        //byte num1 = input.nextByte();
        short num=input.nextShort();
        System.out.println("Enter the second number:");
        int num2=input.nextInt();
        System.out.println("Enter your third number: ");
        long num3= input.nextLong();


        input.close();

        System.out.println("First number is: "+num);
        System.out.println("Second number is: "+num2);
        System.out.println("Third number is: "+num3);



    }
}
