package com.jeskert.leetcode.easy;

public class LeastMinute {
    public int leastMinutes(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + 1, dp[(i + 1) / 2] + 1);
        }
        return dp[n];
    }

}
