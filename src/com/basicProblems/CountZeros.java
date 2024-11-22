package com.basicProblems;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println (count ());

    }
    static int count(){
        return helper(20304503,0);

    }

     //special pattern,how to pass a value to above calls
    private static int helper(int n , int count) {
        if (n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return helper ( n/10,count+1 );
        }
        return helper ( n/10,count );
    }
}
