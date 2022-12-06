package day21;

public class task01 {
    public static void main(String[] args) {


        System.out.println(isPrime(6));
        System.out.println(isPrime(11));

    }

    public static boolean isPrime(int number){
boolean result = true;
if (number<=1){
    result = false;
}else {
    for (int i = 2; i < number; i++) {
        if (number %i==0){
            result = false;
            break;
        }

    }
}
return result;

    }

}
