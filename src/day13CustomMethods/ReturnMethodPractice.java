package day13CustomMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {
    int val=max(10,90);


    }


    public static int max(int n1,int n2){
        int result=0;

        if (n1>n2){
            result=n1;

            System.out.println(result+" is Max number");
        } else if (n2>n1) { result=n2;
            System.out.println(result+" is Max number");

        }else{
            System.out.println("Numbers are equal");}


        return result;
    }
}
