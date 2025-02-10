package com.tcs_Array_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr ={4,8,7,2,6,9,4,2,8};
        int target =14;
        int[] result=twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSum(int[] arr, int target){
        for(int i=0;i<arr.length-1;i++ ){
            for (int j = i+1; j <=arr.length-1 ; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }

}
