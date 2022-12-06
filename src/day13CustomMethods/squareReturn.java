package day13CustomMethods;

public class squareReturn {
    public static void main(String[] args) {
        int total=square(5);
        System.out.println(total);

    }

    public static  int square(int n1){


        int square=n1*n1*n1;
        return square;
    }
}
