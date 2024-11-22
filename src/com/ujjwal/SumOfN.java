package com.ujjwal;

public class SumOfN {
    /**
     * Example usage of the {@link #Sum(int)} method.
     * <p>
     * This program will print the sum of the first 4 natural numbers.
     */
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
