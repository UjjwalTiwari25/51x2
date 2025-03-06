package com.tcs.NumberSystem;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 42; // 42 -> 101010 in binary
        int i = 0;    // Set the 3rd bit (0-based index)

        System.out.println("Number after setting " + i + "th bit: " + setBit(num, i));
    }

    private static int setBit(int num, int i) {
        return num | (1 << i); // Perform bitwise OR to set the ith bit
    }
}
