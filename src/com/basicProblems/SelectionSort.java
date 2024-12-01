package com.basicProblems;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4]
    }

    static void selectionSort(int[] arr, int row, int col, int max) {
        if (row == 0) { // Base case: When all rows are processed
            return;
        }

        if (col < row) { // Finding the maximum element in the current row
            if (arr[col] > arr[max]) {
                selectionSort(arr, row, col + 1, col); // Update max index
            } else {
                selectionSort(arr, row, col + 1, max); // Continue without updating max
            }
        } else {
            // Swap the maximum element with the last element of the current row
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;

            // Move to the next row (subarray) and reset col and max to 0
            selectionSort(arr, row - 1, 0, 0);
        }
    }
}
