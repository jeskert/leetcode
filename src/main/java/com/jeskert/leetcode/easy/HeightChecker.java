package com.jeskert.leetcode.easy;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                res++;
            }
        }
        return res;
    }
}
