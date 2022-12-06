package day07;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num=100;
        String result="";
        if (num>0){
            result= "Posetive";
        }
        if (num<0){
            result="Negative";
        }
        if (num==0){
            result="Zero";
        }
        System.out.println(result);
        System.out.println("------------------------");


        String result2 ="";
        if (num>0){
            result2="poditive";
        } else if (num<0) {
            result2="negstive";

        }else {
            result2="is Zero";

        }
        System.out.println(result2);


    }
}
