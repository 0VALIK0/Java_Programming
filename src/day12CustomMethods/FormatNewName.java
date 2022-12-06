package day12CustomMethods;

public class FormatNewName {

    public static void main(String[] args) {

String first="jAva";
String last= "SCHOOL";

first=first.substring(0,1).toUpperCase() + first.substring(1).toUpperCase();


last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullname=first+" "+last;
        System.out.println(fullname);

    }
}
