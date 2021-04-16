package com.jeskert.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].contains(words[i]) && i != j) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
