package com.ujjwal;

public class concept {
    public static void main(String[] args) {
     fun ( 5 );
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println (n);
//        fun(n--); //it will give stack overflow
          fun ( --n ); //use --n as replacement of n=n-1...not n--
    }
}
