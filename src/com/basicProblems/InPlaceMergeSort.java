package com.basicProblems;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        // Array ko initialize karo jo unsorted hai
        int[] arr = {5, 4, 3, 2, 1};

        // Merge sort function ko call karo with start (0) and end (length - 1)
        mergeSort(arr, 0, arr.length - 1);

        // Sorted array ko print karo
        System.out.println(Arrays.toString(arr));
    }

    // Merge sort function (Recursive)
    static void mergeSort(int[] arr, int start, int end) {
        // Base condition: Agar array ka size 1 ya less hai, return kar do
        if (start >= end) {
            return;
        }

        // Midpoint calculate karo (start + end)/2
        int mid = start + (end - start) / 2;

        // Left half ko recursively sort karo
        mergeSort(arr, start, mid);

        // Right half ko recursively sort karo
        mergeSort(arr, mid + 1, end);

        // In-place merge function call karo jo left aur right halves ko merge karega
        mergeInPlace(arr, start, mid, end);
    }

    // In-place merge function
    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        // Left half ka pointer (start se)
        int i = start;

        // Right half ka pointer (mid + 1 se)
        int j = mid + 1;

        // Jab tak dono halves traverse nahi ho jaate, tab tak loop chalega
        while (i <= mid && j <= end) {
            // Agar left half ka element smaller ya equal hai, to sahi jagah par hai
            if (arr[i] <= arr[j]) {
                i++; // Left half pointer ko aage badhao
            } else {
                // Agar right half ka element chhota hai to usse sahi jagah par rakhna hoga
                int temp = arr[j]; // Right half ka smaller element temporarily store karo

                // Left half ke elements ko right shift karo taaki space create ho
                int k = j;
                while (k > i) {
                    arr[k] = arr[k - 1]; // Ek step right shift karo
                    k--; // Pointer ko ek position left le jao
                }

                // Smaller element ko sahi jagah par place karo
                arr[i] = temp;

                // Pointers ko update karo:
                i++;    // Left pointer ko ek position aage le jao
                mid++;  // Mid boundary ko aage badhao (kyunki ek element left mein shift ho gaya)
                j++;    // Right pointer ko next element ke liye aage badhao
            }
        }
    }
}

