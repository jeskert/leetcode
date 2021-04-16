package com.jeskert.leetcode.easy;

public class SpecialArrayWithSpecialElement {
    public int specialArray(int[] nums) {
        for (int i = 0; i <= nums.length; i++) {
            if (greaterThanCount(nums, i) == i) {
                return i;
            }
        }
        return -1;
    }

    private int greaterThanCount(int[] nums, int x) {
        int count = 0;
        for (int num : nums) {
            if (num >= x) {
                count++;
            }
        }
        return count;
    }
}
