package com.basicProblems;

public class reverseNumber {

    //Method 1:

    static int sum =0;  //here we have taken outside value as main value
    static void revMethod1(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum =sum*10 +rem;
        revMethod1 (n/10);
    }

    //method 2:
    //what if we don't want to take outside value as main value

    static int revMethod2(int n){
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


    public static void main(String[] args) {
        System.out.println (revMethod2( 1342 ));
//        System.out.println (sum);
    }

}
