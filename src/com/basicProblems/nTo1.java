package com.basicProblems;

public class nTo1 {
    public static void main(String[] args) {
        func(5);     //not sout because we are not returning any value
    }
    static void func(int n){//void because there is no return type
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(n-1);
        }

}
