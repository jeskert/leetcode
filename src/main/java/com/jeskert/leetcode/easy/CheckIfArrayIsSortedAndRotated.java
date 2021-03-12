package com.jeskert.leetcode.easy;

public class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {
        int length = nums.length;
        boolean isRotated = nums[0] >= nums[length - 1];
        for (int i = 1; i < length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (isRotated) {
                    isRotated = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}