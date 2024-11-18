package com.basicProblems;

public class sumOfDigits {
    public static void main(String[] args) {
      int ans =sumOfDigits ( 987654321 );
        System.out.println (ans);
    }
    static int sumOfDigits(int n) {
        if (n/10<1){
            return n;
        }
        return sumOfDigits ( n/10 )+ n%10;
    }
}
