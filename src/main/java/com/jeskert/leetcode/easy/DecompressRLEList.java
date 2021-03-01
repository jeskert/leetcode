package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLEList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length / 2) {
            for (int j = 0; j < nums[2 * i]; j++) {
                result.add(nums[2 * i + 1]);
            }
            i++;
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
