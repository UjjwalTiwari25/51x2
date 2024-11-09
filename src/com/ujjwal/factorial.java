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
