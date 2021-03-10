package com.jeskert.leetcode.easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int lastMax = res;
        for (int i = 1; i < nums.length; i++) {
            lastMax = Math.max(lastMax + nums[i], nums[i]);
            res = Math.max(lastMax, res);
        }
        return res;
    }
}
