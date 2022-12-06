package day07;

public class LoanApplication {

    public static void main(String[] args) {
    int salary=55000,
            creditScore=700;
    String result= "";


    if ( salary >= 45000 && creditScore >= 700){
         result= "You are eligible for the loan";
      }else{
         result="You are not eligible";
    }
        System.out.println(result);
    }
}
