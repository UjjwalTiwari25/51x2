package com.basicProblems;

class findingNth_term {
    static long get(long n) {
        long segment = 1;
        long endPosition = 1;

        while (endPosition < n) {
            segment = segment + 1;
            endPosition = endPosition + segment;
        }

        long startPosition = endPosition - segment + 1;
        return n - startPosition + 1;
    }
}
