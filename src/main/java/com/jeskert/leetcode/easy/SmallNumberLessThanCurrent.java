package com.jeskert.leetcode.easy;

public class SmallNumberLessThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }

        int length = nums.length;
        int[] result = new int[length];
        int[] counter = new int[101];

        for (int num : nums) {
            counter[num]++;
        }

        for (int i = 1; i <= 100; i++) {
            counter[i] += counter[i - 1];
        }

        for (int i = 0; i < length; i++) {
            result[i] = nums[i] == 0 ? 0 : counter[nums[i] - 1];
        }

        return result;
    }
}
