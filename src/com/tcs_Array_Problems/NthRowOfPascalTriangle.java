package com.tcs_Array_Problems;
import java.util.ArrayList;

public class NthRowOfPascalTriangle {

    public ArrayList<Integer> nthRow(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        long value = 1;
        ans.add(1); // First element is always 1

        for (int col = 1; col < n; col++) {
            value = value * (n - col);
            value = value / col;
            ans.add((int) value);
        }
        return ans;
    }

    public static void main(String[] args) {
        NthRowOfPascalTriangle sol = new NthRowOfPascalTriangle();
        int n = 5;
        ArrayList<Integer> result = sol.nthRow(n);
        System.out.println(result);
    }
}
