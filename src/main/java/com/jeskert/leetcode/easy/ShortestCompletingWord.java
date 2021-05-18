package com.jeskert.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> countMap = convertToCountMap(licensePlate);
        int shortestLength = Integer.MAX_VALUE;
        String result = "";
        for (String word : words) {
            if (isCompletingWord(countMap, word)) {
                if (word.length() < shortestLength) {
                    shortestLength = word.length();
                    result = word;
                }
            }
        }
        return result;
    }

    private boolean isCompletingWord(Map<Character, Integer> countMap, String word) {
        Map<Character, Integer> currentCountMap = convertToCountMap(word);
        for (Character c : countMap.keySet()) {
            int currentCount = currentCountMap.getOrDefault(c, 0);
            if (countMap.get(c) > currentCount || currentCount == 0) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> convertToCountMap(String word) {
        Map<Character, Integer> countMap = new HashMap<>();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (countMap.containsKey(c)) {
                    Integer currentCnt = countMap.get(c);
                    countMap.put(c, currentCnt + 1);
                } else {
                    countMap.put(c, 1);
                }
            }
        }
        return countMap;
    }
}
