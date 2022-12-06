package day14Loop;

public class MethodOverloadingPractice {
    public static void main(String[] args) {
        System.out.println( sum(10,20));
        System.out.println(sum(20,30,50));
        System.out.println(sum(1.5, 3.8));
    }

    public static int sum(int n1,int n2){

        int result;

        result= n1+ n2;
        return result;

    }

    public static int sum( int n1,int n2,int n3){
    return sum( n1 , n2 )+ n3;


    }
    public static double sum(double n1,double n2){

        return n1+n2;
    }


}
