package com.basicProblems;

public class productOfDigits {
    public static void main(String[] args) {
        int result =product ( 54321 );
        System.out.println (result);
    }
    static int product(int n){
        if(n/10<1){
            return n;
        }
        return (product (n/10)*(n%10));
    }
}
