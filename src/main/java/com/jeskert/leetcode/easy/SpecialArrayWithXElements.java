package com.jeskert.leetcode.easy;

public class SpecialArrayWithXElements {
    public int specialArray(int[] nums) {
        for (int x = 1; x <= nums.length; x++) {
            int res = 0;
            for (int num : nums) {
                if (num >= x) {
                    res++;
                }
            }
            if (res == x) {
                return x;
            }
        }
        return -1;
    }
}
