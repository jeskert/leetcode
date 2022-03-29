package com.jeskert.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> countMap = new HashMap<>();
        Map<Character, Integer> currentMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (currentMap.isEmpty()) {
                for (char c : s.substring(0, p.length()).toCharArray()) {
                    currentMap.put(c, currentMap.getOrDefault(c, 0) + 1);
                }
            } else {
                char pre = s.charAt(i - 1);
                char pos = s.charAt(i + p.length() - 1);
                currentMap.put(pre, currentMap.get(pre) - 1);
                currentMap.put(pos, currentMap.getOrDefault(pos, 0) + 1);
            }
            if (isSameMap(countMap, currentMap)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isSameMap(Map<Character, Integer> countMap, Map<Character, Integer> currentMap) {
        for (char c : countMap.keySet()) {
            if (!countMap.get(c).equals(currentMap.get(c))) {
                return false;
            }
        }
        return true;
    }
}
