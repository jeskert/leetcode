package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
        }
        return Integer.compare(Arrays.stream(nums).map(num -> num > 0 ? 1 : -1).reduce((acc, item) -> {
            acc *= item;
            return acc;
        }).getAsInt(), 0);
    }
}
