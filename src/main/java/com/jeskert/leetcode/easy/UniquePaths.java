package com.jeskert.leetcode.easy;

public class UniquePaths {
    private int[][] memo;
    // dp[m, n] = dp[m - 1, n] + dp[m, n - 1]
    public int uniquePaths(int m, int n) {
        memo = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                memo[i][j] = -1;
            }
        }
        return dp(m, n);
    }

    private int dp(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
        memo[m][n] = dp(m - 1, n) + dp(m, n - 1);
        return memo[m][n];
    }
}
