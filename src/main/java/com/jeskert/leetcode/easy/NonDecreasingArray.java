package com.jeskert.leetcode.easy;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int turnCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                turnCount++;
            }
        }
        return turnCount <= 1;
    }
}
