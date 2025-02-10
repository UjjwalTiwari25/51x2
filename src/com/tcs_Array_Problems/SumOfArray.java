package com.tcs_Array_Problems;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={4,7,8,9,6,5};
        System.out.println(sum(arr));

    }
    static int sum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;

    }


    //using void return type
//    public static void main(String[] args) {
//        int[] arr={4,7,8,9,6,5};
//        sum(arr);
//
//
//    }
//    static void sum(int arr[]){
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum=sum+arr[i];
//
//        }
//        System.out.println("sum is "+ sum);
//
//    }

}
