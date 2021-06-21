package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class DifferentIntegers {
    public int numDifferentIntegers(String word) {
        String s = word.replaceAll("$[a-z]+", " ");
        String[] arr = s.split(" ");
        Map<String, Integer> countMap = new HashMap<>();
        for (String ele : arr) {
            if (!ele.equals(" ")) {
                if (!countMap.containsKey(ele)) {
                    countMap.put(ele, 1);
                } else {
                    Integer currentCnt = countMap.get(ele);
                    countMap.put(ele, currentCnt + 1);
                }
            }
        }
        return countMap.keySet().size();
    }
}
