package day14Loop;

public class forLoop3 {
    public static void main(String[] args) {

        String str="Valentin";
String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+=str.charAt(i);

        }
        System.out.println(reverse);

        System.out.println("------------------------------");
        String name ="How are you my friend";

        String result=reverse(name);
        System.out.println(result);

    }
    public static String reverse(String str){


        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reverse+=str.charAt(i);}
        
        return reverse;
    }
}
