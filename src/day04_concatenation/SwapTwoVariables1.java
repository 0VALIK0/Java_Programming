package day04_concatenation;

public class SwapTwoVariables1 {
    public static void main(String[] args) {
     int x =10, y=15;
     int z =x;
     x=y;
     y=z;

        System.out.println("x= "+x);
        System.out.println("y= "+z);





    }
}
//  x
//            y
//            z
//
//    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
//        Ex:
//              x = 10
//              y = 15
//
//        output:
//                  x = 15
//                  y = 20