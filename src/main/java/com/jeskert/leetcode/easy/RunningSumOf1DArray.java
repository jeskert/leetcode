package com.jeskert.leetcode.easy;

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                result[i] = result[i - 1] + nums[i];
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}
