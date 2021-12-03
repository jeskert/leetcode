package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        int eat = candyType.length / 2;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int type : candyType) {
            if (countMap.containsKey(type)) {
                countMap.put(type, countMap.get(type) + 1);
            } else {
                countMap.put(type, 1);
            }
        }
        return Math.min(eat, countMap.size());
    }
}
