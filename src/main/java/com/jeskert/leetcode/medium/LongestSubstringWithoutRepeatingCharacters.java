package com.jeskert.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Map<Character, Integer> window = new HashMap<>();
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (window.containsKey(c)) {
                left = Math.max(left, window.get(c) + 1);
            }
            window.put(c, i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}
