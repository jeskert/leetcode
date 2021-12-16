package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        int target = edges.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int[] edge : edges) {
            for (int point : edge) {
                if (countMap.containsKey(point)) {
                    countMap.put(point, countMap.get(point) + 1);
                } else {
                    countMap.put(point, 1);
                }
                if (countMap.get(point) == target) {
                    return point;
                }
            }
        }
        return 0;
    }
}
