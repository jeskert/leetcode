package com.jeskert.leetcode.easy;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        int endMin = min + k;
        int startMax = max - k;
        return startMax < endMin ? 0 : startMax - endMin;
    }
}
