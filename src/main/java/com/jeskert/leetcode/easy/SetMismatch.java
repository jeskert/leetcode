package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                Integer currentCount = countMap.get(num);
                countMap.put(num, currentCount + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!countMap.containsKey(i)) {
                res[1] = i;
                continue;
            }
            if (countMap.get(i) == 2) {
                res[0] = i;
            }
        }
        return res;
    }


}
