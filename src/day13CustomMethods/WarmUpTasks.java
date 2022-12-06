package day13CustomMethods;

import java.util.Scanner;

public class WarmUpTasks {
    public static void main(String[] args) {
        calculate(8,15,'*');
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your two numbers");

        double n1=input.nextDouble(),
                n2= input.nextDouble();
        char operator=input.next().charAt(0);
        calculate (n1,n2,operator);
        System.out.println("------------------------------");

    }
    public static void calculate (double num1,double num2,char mathoperator){
        double result=0;
        switch (mathoperator){

            case '+':result=num1+num2;
                System.out.println(num1+" "+mathoperator+" "+num2+"="+(num1+num2));
                break;
            case '-':result=num1-num2;
                System.out.println(num1+" "+mathoperator+" "+num2+"="+(num1-num2));
                break;
            case '*': result=num1*num2;
                System.out.println(num1+" "+mathoperator+" "+num2+"="+(num1*num2));
                break;
            case '/': result=num1/num2;
                System.out.println(num1+" "+mathoperator+" "+num2+"="+(num1/num2));
                break;
            default:
                System.out.println("Invalid operator "+mathoperator);
        }


    }

}
