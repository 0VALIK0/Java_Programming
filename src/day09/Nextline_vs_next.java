package day09;
import java.util.Scanner;
public class Nextline_vs_next {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name: ");
        String name= input.nextLine();
        System.out.println("age: "+age);
        System.out.println("name: "+name);

    }
}