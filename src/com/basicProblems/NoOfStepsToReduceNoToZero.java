package com.basicProblems;

public class NoOfStepsToReduceNoToZero {
    public static void main(String[] args) {
        int num = 14; // Hardcoded number
        int steps = numberOfSteps(num); // Directly call the static method
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0); // Start recursion with initial count as 0
    }

    private static int helper(int n, int count) {
        if (n == 0) { // Base case: when the number is reduced to 0
            return count;
        }
        if (n % 2 == 0) { // If the number is even
            return helper(n / 2, count + 1);
        } else { // If the number is odd
            return helper(n - 1, count + 1);
        }
    }
}
