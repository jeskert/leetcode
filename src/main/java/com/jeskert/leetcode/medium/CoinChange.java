package com.jeskert.leetcode.medium;

import java.util.Arrays;

public class CoinChange {
    int[] memo;
    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -666);
        return dp(coins, amount);
    }

    int dp(int[] coins, int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }
        if (memo[n] != -666) {
            return memo[n];
        }
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = dp(coins, n - coin);
            if (subProblem == -1) {
                continue;
            }
            res = Math.min(res, subProblem + 1);
        }
        memo[n] = (res == Integer.MAX_VALUE) ? -1 : res;
        return memo[n];
    }
}
