package com.jeskert.leetcode.easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] >= 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }

        int max = dp[0];
        for (int i = 1; i < len; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
