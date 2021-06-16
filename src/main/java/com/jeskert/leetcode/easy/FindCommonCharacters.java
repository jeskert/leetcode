package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[][] counts = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            int[] count = new int[26];
            for (int i1 = 0; i1 < words[i].length(); i1++) {
                count[words[i].charAt(i1) - 97]++;
            }
            counts[i] = count;
        }

        for (int i = 0; i < 26; i++) {
            int min = counts[0][i];
            for (int i1 = 0; i1 < words.length; i1++) {
                if (counts[i1][i] < min) {
                    min = counts[i1][i];
                }
            }
            for (int j = 0; j < min; j++) {
                result.add(String.valueOf((char) (i + 97)));
            }
        }
        return result;
    }

}
