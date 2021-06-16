package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FindLucky {
    public int findLucky(int[] arr) {
        int res = -1;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        for (Integer i : countMap.keySet()) {
            if (i.equals(countMap.get(i)) && i > res) {
                res = i;
            }
        }
        return res;
    }

}
