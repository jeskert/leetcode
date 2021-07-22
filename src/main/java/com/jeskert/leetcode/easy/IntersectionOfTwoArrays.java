package com.jeskert.leetcode.easy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums1) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        Set<Integer> res = new HashSet<>();
        for (int num : nums2) {
            if (countMap.containsKey(num)) {
                res.add(num);
            }
        }

        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = (int) res.toArray()[i];
        }
        return resArr;
    }
}
