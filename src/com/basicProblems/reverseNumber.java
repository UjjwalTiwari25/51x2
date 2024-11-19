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

    static void revMethod2(int n){
        //now we need base condition
        //sometimes we might need some additional variable in the argument ...in that case ,make another function as helper function
         return ;

    }



    public static void main(String[] args) {
       revMethod1 ( 1342 );
        System.out.println (sum);
    }

}
