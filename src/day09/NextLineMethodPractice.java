package day09;
import java.util.Scanner;
public class NextLineMethodPractice {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your full name ");
        String fullName= input.nextLine();

        System.out.println("Enter your school name");
        String school= input.nextLine();
        System.out.println("Enter your gender");
        String gender= input.next();



    }
}
