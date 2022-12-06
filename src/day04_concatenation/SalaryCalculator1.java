package day04_concatenation;

public class SalaryCalculator1 {
    public static void main(String[] args) {
        int hourlyRate=50;
        int weeklyHours=45;
        double stateTaxRate =6; //percentage
        double federalTaxRate =26;
        int salary_per_year =hourlyRate*weeklyHours*52;
        int total_stateTax= (int) (salary_per_year*(stateTaxRate/100));
        int total_FederalTax= (int) (salary_per_year*(federalTaxRate/100));

        System.out.println("Gross pay is: $"+salary_per_year);
        System.out.println("\tFederal tax is: $"+salary_per_year*federalTaxRate/100);
        System.out.println("\tState tax is : $"+salary_per_year*(stateTaxRate/100));
        System.out.println("\tTotal tax is: $"+(total_stateTax+total_FederalTax));
        System.out.println("\t Net income is: $"+(salary_per_year- total_stateTax-total_FederalTax));


    }
}


//               Gross pay is: $117000
//                    Federal tax is: $30420
//                    State tax is: $7020
//                    Total tax is: $37440
//                     Net income is: $79560
//

//        output:
//               Gross pay is: $117000
//                    Federal tax is: $30420
//                    State tax is: $7020
//                    Total tax is: $37440
//                     Net income is: $79560