package com.basicProblems;

import java.util.ArrayList;

public class ReturnAll_IndexOfTarget {
    public static void main(String[] args) {
        int[]arr={2,3,1,4,4,5};
//        ArrayList<Integer> ans=findAllIndex( arr,4,0,new ArrayList<> () );
//        System.out.println(ans);
        System.out.println(findAllIndex2(arr,4,0));

    }
    //Method 1: passing arraylist to parameter

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index , ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add ( index );
        }
        return findAllIndex ( arr,target,index+1,list );
    }




    //Method 2 : passing answer indivisually to each function call

    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index ){

        ArrayList<Integer> list=new ArrayList<> ();
        if(index==arr.length){
            return list;
        }
        //this will contain answer for that call only
        if(arr[index]==target){
            list.add ( index );
        }
        ArrayList<Integer> ansfromBellowCalls=findAllIndex2 ( arr,target,index+1);

        list.addAll ( ansfromBellowCalls );

        return list;
    }
}
