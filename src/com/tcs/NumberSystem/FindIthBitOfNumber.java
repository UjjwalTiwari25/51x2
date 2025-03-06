package com.tcs.NumberSystem;

public class FindIthBitOfNumber {
    public static void main(String[] args) {
        int num = 42; // Number in decimal (42 -> 101010 in binary)
        int i = 3;    // Position of the bit to check (0-based index)

        System.out.println("The " + i + "th bit is: " + ithBit(num, i));
    }

    private static int ithBit(int num, int i) {
        int mask = 1 << i; // Shift '1' to the ith position (creates a mask)
        int result = num & mask; // Perform bitwise AND with num

        return (result != 0) ? 1 : 0; // If non-zero, bit is 1; otherwise, it's 0
    }
}
