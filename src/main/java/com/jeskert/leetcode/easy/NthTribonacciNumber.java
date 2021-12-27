package com.jeskert.leetcode.easy;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int[] memo = new int[n + 1];
        return dp(n, memo);
    }

    private int dp(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = dp(n - 2, memo) + dp(n - 1, memo) + dp(n - 3, memo);
        return memo[n];
    }
}
