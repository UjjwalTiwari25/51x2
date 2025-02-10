package com.tcs_Array_Problems;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={5,4,3,3,8,9};
//        System.out.println(max(arr));
        System.out.println(maxInRange(arr,1,2));
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
    static int maxInRange(int arr[],int start,int end){
        int maxInRange = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]> maxInRange){
                maxInRange =arr[i];

            }

        }
        return maxInRange;
    }
}
