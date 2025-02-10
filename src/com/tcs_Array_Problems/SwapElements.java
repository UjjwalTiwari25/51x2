package com.tcs_Array_Problems;

import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        // Printing the original array
        System.out.println("\nOriginal Array:");
        printArray(arr);

        // Swapping 2nd and 3rd elements
        swap(arr, 1, 2);

        // Printing the modified array
        System.out.println("\nArray After Swapping First and Last Element:");
        printArray(arr);
    }

    // Method to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
