package com.jeskert.leetcode.medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> keyMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = convertToKey(strs[i]);
            if (keyMap.containsKey(key)) {
                keyMap.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                keyMap.put(key, list);
            }
        }
        return new ArrayList<>(keyMap.values());
    }

    private String convertToKey(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        StringBuilder key = new StringBuilder();
        for (int i = 97; i <= 122; i++) {
            char c = (char) i;
            int count = countMap.getOrDefault(c, 0);
            key.append(c).append(count);
        }
        return key.toString();
    }
}
