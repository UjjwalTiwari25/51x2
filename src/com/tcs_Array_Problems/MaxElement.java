package com.tcs_Array_Problems;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={5,4,7,3,8,9};
        System.out.println(max(arr));
    }
    static int max(int arr[]){
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];

            }

        }
       return max;
    }
}
