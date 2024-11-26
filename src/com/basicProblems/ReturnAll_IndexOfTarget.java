package com.basicProblems;

import java.util.ArrayList;

public class ReturnAll_IndexOfTarget {
    public static void main(String[] args) {
        int[]arr={2,3,1,4,4,5};
        System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));

    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index , ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add ( index );
        }
        return findAllIndex ( arr,target,index+1,list );
    }
}
