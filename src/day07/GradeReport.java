package day07;

public class GradeReport {
    public static void main(String[] args) {

      int score=80;
      String result="Your grade is ";

      if (score>=90){
          result+="A";
      } else if (score>=80 && score <90) {
          result+="B";
      } else if (score>=70 && score<80) {
          result+="C";
      } else if (score>=60 && score<70) {
          result="Grade is D";
      }else {
          result= "Geade is F";}

        System.out.println("Your Grade is: "+result);


    }
}
