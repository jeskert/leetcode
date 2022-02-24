package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(target - nums[i])) {
                return new int[]{countMap.get(target - nums[i]), i};
            }
            countMap.put(nums[i], i);
        }
        return new int[0];
    }
}
