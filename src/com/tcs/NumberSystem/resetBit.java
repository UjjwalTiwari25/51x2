package com.tcs.NumberSystem;

public class resetBit {
    public static void main(String[] args) {
        int num=42;
        int i=1;
        System.out.println(reset(num,i));
    }
    private static int reset(int num,int i){
        return num & ~(1<<i);

    }
}
