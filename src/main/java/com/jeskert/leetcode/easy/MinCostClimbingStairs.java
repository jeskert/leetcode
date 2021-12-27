package com.jeskert.leetcode.easy;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length + 2];
        return dp(memo, cost, cost.length);
    }

    private int dp(int[] memo, int[] cost, int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return Math.min(cost[0], cost[1]);
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = Math.min(dp(memo, cost, n - 1) + cost[n - 1], dp(memo, cost, n - 2) + cost[n - 2]);
        return memo[n];
    }
}
