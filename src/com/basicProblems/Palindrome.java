package com.basicProblems;

public class Palindrome {
    public static void main(String[] args) {
        int number = 1234321; // Example number
        if (Palindrome(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is NOT a Palindrome.");
        }
    }
    static int rev(int n){
        //now we need base condition
        //sometimes we might need some additional variable in the argument ...in that case ,make another function as helper function
        int digit = (int)(Math.log10 ( n ))+1;
        return helper(n,digit);
    }

    private static int helper(int n , int digit) {
        if(n%10==n){
            return n;
        }
        int rem =n%10;
        return rem*(int)Math.pow ( 10,digit-1 )+helper ( n/10 ,digit-1 );
    }
    static boolean Palindrome(int n) {
        return n == rev ( n );
    }
}
