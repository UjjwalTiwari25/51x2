package com.ujjwal;

public class SumOfN {
    public static void main(String[] args) {
      int ans = Sum(4);
        System.out.println (  ans );
    }
    static int Sum(int n){
        if(n<2){
            return 1;
        }
        return n + Sum(n-1);

    }
}
