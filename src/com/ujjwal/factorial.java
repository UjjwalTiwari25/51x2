package com.ujjwal;

public class factorial {
    public static void main(String[] args) {
        int ans = fact(4);
        System.out.println (  ans );
    }

    static int fact(int n){
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
 /*
 step 1: look what r the things that being repeated..
  hre it is... fact(4)=4*fact(3)=4*3*fact(2)=4*3*2*fact(1)=4*3*2*1
  step 2 : base case..here base case is fact(1)=1
  */