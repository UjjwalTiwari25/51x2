package com.basicProblems;

public class reverseNumber {

    static int sum =0;
    static void revMethod1(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum =sum*10 +rem;
        revMethod1 (n/10);
    }

    public static void main(String[] args) {
       revMethod1 ( 1342 );
        System.out.println (sum);
    }

}
