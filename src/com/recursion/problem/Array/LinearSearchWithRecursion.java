package com.recursion.problem.Array;

/*public class LinearSearchWithRecursion {
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
}*/


//what if something array given like Arr={1,5,4,8,4,4,5}
// and we have to find index of evey 4

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[]arr ={1,5,4,8,4,4,5};
        findAllIndex ( arr,4,0 );
        System.out.println (list);
    }
    static ArrayList<Integer> list=new ArrayList<> ();
    static void findAllIndex(int[] arr,int target , int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add ( index );
        }
            findAllIndex ( arr,target,index+1 );
    }
}