package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
            } else {
                Integer currentCount = countMap.get(num);
                countMap.put(num, currentCount + 1);
            }
        }

        int res = 0;
        for (Integer key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                res += key;
            }
        }
        return res;
    }
}
