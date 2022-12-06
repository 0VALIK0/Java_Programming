package day11;

public class StringMethods1 {
    public static void main(String[] args) {


        String str1="CYDEO SCHOOL";
        str1=str1.toLowerCase();// cydeo school

        System.out.println(str1);


//************************************

        String str2="cydeo school";
         str2=str2.toUpperCase();  // cydeo school

        System.out.println(str2);

        //***************************
        String str4="Wooden Spoon";

        str4 = str4.toUpperCase();

        System.out.println(str4);

        //**********************



        String trim1="     Cydeo";
              trim1=  trim1.trim();
        System.out.println(trim1);


        //***********
        String sentence1="today is sunday, and we have a JA*VA clss";
       int index1=sentence1.indexOf('w');
        System.out.println(index1);

       //************





    }
}
