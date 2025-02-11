package com.tcs_Array_Problems;

public class FindingMissingNumberInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(missingIs(arr));
    }
    static int missingIs(int arr[]){
        int N=arr.length+1;
        int expectedSum=(N*(N+1))/2;
        int actualSum=0;
        for (int i = 0; i < arr.length; i++) {
            actualSum+=arr[i];

        }
        return (expectedSum-actualSum);
    }
}
