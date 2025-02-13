package com.tcs_Array_Problems;
import java.util.*;

public class NthRowOfPascalTriangle {

        public ArrayList<Integer> nthRowOfPascalTriangle(int n) {
            ArrayList<Integer> ans = new ArrayList<>();
            long value = 1; // Separate variable for calculations
            ans.add(1); // First element is always 1

            for (int col = 1; col < n; col++) {
                value = value * (n - col);
                value = value / col;
                ans.add((int) value);
            }
            return ans;
        }

}
