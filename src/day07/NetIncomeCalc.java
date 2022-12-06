package day07;

import java.beans.PropertyEditorSupport;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary= 115000;
        boolean isMarried=true;
        double taxRate = 0;

        if(salary >= 130000){
            taxRate =0.35;
        }
        if (salary>=100000 && salary<130000){
            taxRate=0.3;
        }
        if (salary>=80 && salary<100000){
            taxRate=0.25;
        }
        if (salary<= 800000){
            taxRate=0.2;
        }
        if (isMarried){
            taxRate-=0.05;
        }
        double netIncome = salary*(1-taxRate);
        double totalTax = salary*taxRate;

        System.out.println("salary ="+salary);
        System.out.println("Net Income is: " + netIncome);
        System.out.println("total Tax= " + totalTax);






    }
}
