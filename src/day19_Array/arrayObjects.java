package day19_Array;

import java.util.Arrays;

public class arrayObjects {
    public static void main(String[] args) {


        int[] arr1={10,20,30,40,50};
        int[] arr2= arr1;
        int[] arr3=arr2;
        arr1[0]= 1000;
        arr2[2] = 3000;


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

}
