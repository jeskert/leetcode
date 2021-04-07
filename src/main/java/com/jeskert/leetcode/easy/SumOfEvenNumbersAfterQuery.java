package com.jeskert.leetcode.easy;

public class SumOfEvenNumbersAfterQuery {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] results = new int[queries.length];
        int currentSum = 0;
        for (int j : A) {
            if (j % 2 == 0) {
                currentSum += j;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int base = A[queries[i][1]];
            A[queries[i][1]] += queries[i][0];
            if (base % 2 == 0) {
                if (A[queries[i][1]] % 2 == 0) {
                    currentSum += A[queries[i][1]] - base;
                } else {
                    currentSum -= base;
                }
            } else {
                if (A[queries[i][1]] % 2 == 0) {
                    currentSum += A[queries[i][1]];
                }
            }
            results[i] = currentSum;
        }
        return results;
    }

}
