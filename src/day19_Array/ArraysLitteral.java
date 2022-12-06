package day19_Array;

import java.util.Arrays;

public class ArraysLitteral {
    public static void main(String[] args) {


        int [] numbers= new int[5];

       int[] nums={10,20,30,40,50};

        System.out.println("numbers = "+ Arrays.toString(numbers));
        System.out.println("nums = " +Arrays.toString(nums));

        System.out.println("------------------------------------------------");
        String [] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int n = 1;
        System.out.println( days[n-1]);

        System.out.println("------------------------------------------------");

        String [] months= {"January","Feb","March","Apr","May","Jun","July"};
        System.out.println("months = " +Arrays.toString(months));

        System.out.println("------------------------------------------------");

        for (int i = months.length-1; i>=0 ; i--) {
            System.out.println(months[i]);

        }

    }
}
