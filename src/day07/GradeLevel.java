package day07;

public class GradeLevel {
    public static void main(String[] args) {

        int grade=19;
        String school="";

        if (grade>=1 && grade<=5){
        school="Elementary School";
        }
        else if(grade>=6 && grade <=8){
            school="Middle School";
        } else if (grade>=9 && grade<=12) {
            school="High School";
        } else if (grade>=13 && grade<=16) {
            school="college";

        }
        else if (grade>=17 && grade<=18){
            school="Grad School";}
        else {
            school="Invalid Grade";
        }

        System.out.println(school);


    }
}
