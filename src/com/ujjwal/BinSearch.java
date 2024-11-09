package com.ujjwal;

public class BinSearch {
    public static void main(String[] args) {
        int []arr ={ 1,2,4,5,6,85,98,100};
        int target = 100;
        System.out.println ( binarySearch ( arr,target,0,arr.length-1 ) );

    }

    static int binarySearch(int[] arr, int target ,int start ,int end) {

        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;  // mid = (start + end)/2

        if(arr[mid] == target){
            return mid;
        }
       
        if(arr[mid] > target) {
            return binarySearch ( arr,target,start,mid-1 );
        }
        return binarySearch ( arr,target,mid+1,end );

    }
}
