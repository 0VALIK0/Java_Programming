package day13CustomMethods;

public class WarmTadk2 {
    public static void main(String[] args) {
      ageGroup(200);

    }

    public static void ageGroup(int age) {
        if (age < 21) {
            System.out.println(age+" :Teenager");
        } else if (age >= 21 && age<=55){
            System.out.println(age + " : Adult");}
        else if (age>55 && age<=100) {
            System.out.println("Senior");


        }else
            System.out.println("Invalid age: "+ age);


    }
        }




