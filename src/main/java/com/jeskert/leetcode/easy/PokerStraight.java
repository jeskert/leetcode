package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class PokerStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroCount = 0;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[zeroCount] <= 4;
    }
}
