package com.jeskert.leetcode.easy;

public class MinimumDistanceToTheTargetElement {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = 1000;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int abs = Math.abs(i - start);
                if (abs < min) {
                    min = abs;
                }
            }
        }
        return min;
    }
}
