package day14Loop;

public class WarmUp2 {
    public static void main(String[] args) {

        System.out.println(sumOf4(10,20,30,50));

    }


    public static int sumof2int(int n1,int n2){
        return  n1+n2;


    }

    public static  int sumof3(int n1,int n2,int n3){

        return sumof2int(n1,n2)+ n3;

    }

    public static int sumOf4(int n1,int n2,int n3,int n4){
        return sumof3(n1,n2,n3)+n4;

    }

}
