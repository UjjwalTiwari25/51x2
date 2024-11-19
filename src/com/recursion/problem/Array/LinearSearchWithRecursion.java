package com.recursion.problem.Array;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
      int[]arr ={1,4,8,6,0};
        System.out.println (findIndex ( arr,6,0 ));
    }

    static int findIndex(int[] arr,int target , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex ( arr,target,index+1 );
    }
}
