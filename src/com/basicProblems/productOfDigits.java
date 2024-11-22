package com.basicProblems;

public class productOfDigits {
    public static void main(String[] args) {
        int result =product ( 505);
        System.out.println (result);
    }
    /**
     * This function takes a number and returns the product of all its digits.
     * It does this by recursively calling itself with the number divided by 10
     * and multiplying the result by the remainder of that division.
     * @param n the number to calculate the product of its digits
     * @return the product of all the digits in n
     */
    static int product(int n){
        if(n/10<1){
            return n;
        }
        return (product (n/10)*(n%10));
    }
}
