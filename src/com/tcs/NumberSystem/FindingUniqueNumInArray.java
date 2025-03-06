package com.tcs.NumberSystem;

import java.util.Scanner;

public class FindingUniqueNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("The unique number is: " + isUnique(arr));
    }

    private static int isUnique(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;  // XOR operation to find the unique number
        }
        return unique;
    }
}
