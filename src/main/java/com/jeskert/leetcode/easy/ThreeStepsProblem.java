package com.jeskert.leetcode.easy;

public class ThreeStepsProblem {
    public int waysToStep(int n) {
        if (n <= 2) {
            return n;
        }
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
        }
        return (int)dp[n];
    }
}
