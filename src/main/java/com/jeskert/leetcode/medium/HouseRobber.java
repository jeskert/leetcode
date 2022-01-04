package com.jeskert.leetcode.medium;

import java.util.Arrays;

public class HouseRobber {
    private int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return dp(nums, 0);
    }

    public int dp(int[] nums, int n) {
        if (n >= nums.length) {
            return 0;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = Math.max(dp(nums, n + 1), nums[n] + dp(nums, n + 2));
        return memo[n];
    }
}
