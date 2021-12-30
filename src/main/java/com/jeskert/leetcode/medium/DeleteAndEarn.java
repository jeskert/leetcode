package com.jeskert.leetcode.medium;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        int[] map = new int[max + 1];
        for (int i : nums) {
            map[i]++;
        }
        int[] dp = new int[max + 1];
        dp[1] = map[1];
        dp[2] = map[2] * 2;
        for (int i = 2; i < max + 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + map[i] * i);
        }
        return dp[max];
    }
}
