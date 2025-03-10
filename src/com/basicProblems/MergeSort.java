package com.basicProblems;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // copies the specified range of the specified array into a new array
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));/*
        The left array is correctly split as Arrays.copyOfRange(arr, 0, mid).
        It includes elements from index 0 to mid - 1.
        The right array is split as Arrays.copyOfRange(arr, mid, arr.length).
        It includes elements from index mid to arr.length - 1.
        */
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mixed = new int[first.length + second.length];
        int i = 0; // pointer for first array
        int j = 0; // pointer for second array
        int k = 0; // pointer for new array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mixed[k] = first[i];
                i++;
            } else {
                mixed[k] = second[j];
                j++;
            }
            k++; // Increment pointer for the mixed array
        }

        // it may be possible that one of the arrays is not complete
        while (i < first.length) {
            mixed[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mixed[k] = second[j];
            j++;
            k++;
        }
        return mixed;
    }
}



