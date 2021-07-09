package com.jeskert.leetcode.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return helper(memo, n);
    }

    int helper(int[] memo, int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
        return memo[n];
    }
}
